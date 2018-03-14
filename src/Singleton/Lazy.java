package Singleton;

/**
 * Created by AmbitiousMice on 2018/3/1.
 */
//懒汉式
public class Lazy {
    private Lazy(){};
    private static Lazy lazy = null;

    //===================================================================================

    //同步实例方法
    public static synchronized Lazy getInstance1(){
        if (lazy == null){
            lazy = new Lazy();
        }
        return lazy;
    }

    //===================================================================================

    //双重检查锁定
    public  static Lazy getInstance2(){
        if (lazy == null){
            synchronized (Lazy.class){
                if (lazy == null){
                    return lazy = new Lazy();
                }
            }
        }
        return lazy;
    }

//===================================================================================

    //静态内部类（推荐使用 线程安全）
    //其主要原理为：Java中静态内部类可以访问其外部类的成员属性和方法，同时，静态内部类只有当被调用的时候才开始首次被加载，
    //利用此特性，可以实现懒汉式，在静态内部类中静态初始化外部类的单一实例即可
    private static class LazyHold{
        private static Lazy INSTANCE = new Lazy();
    }
    public static Lazy getInstance3(){
        return LazyHold.INSTANCE;
    }


    public static void main(String[] args) {
        System.out.println("1内存地址："+getInstance1());
        System.out.println("1内存地址："+getInstance1());
        System.out.println("1内存地址："+getInstance1());

        System.out.println("====================================");

        System.out.println("2内存地址："+getInstance2());
        System.out.println("2内存地址："+getInstance2());
        System.out.println("2内存地址："+getInstance2());

        System.out.println("====================================");

        System.out.println("3内存地址："+getInstance3());
        System.out.println("3内存地址："+getInstance3());
        System.out.println("3内存地址："+getInstance3());
    }
}
