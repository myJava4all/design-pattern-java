package lazy;


/**
 * Create by zhaihongwei on 2018/3/12
 */
public class LazySingleton2 {

    // 私有化构造方法，防止外部实例化
    private LazySingleton2() {}

    // 懒汉模式，在类加载的时候并不实例化对象，而是在第一次调用获取实例化方法的时候实例化对象
    private static LazySingleton2 lazySingleton = null;

    // 获取对象实例的的方法
    public static synchronized LazySingleton2 getInstance() {

        // 判断实例是否为空，为空则创建实例
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton2();
        }

        // 不为空，说明不是第一次调用获取实例的方法，直接返回实例。
        return lazySingleton;
    }
}
