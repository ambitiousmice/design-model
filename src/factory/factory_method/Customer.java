package factory.factory_method;

/**
 * Created by AmbitiousMice on 2018/3/1.
 */
public class Customer {
    public static void main(String[] args) {
        System.out.println("订购一台2S:");
        Xiaomi2SFactory xiaomi2SFactory = new Xiaomi2SFactory();
        xiaomi2SFactory.getXiaomi2S();

        System.out.println("订购一台4:");
        Xiaomi4Factory xiaomi4Factory = new Xiaomi4Factory();
        xiaomi4Factory.getXiaomi4();

        System.out.println("订购一台5:");
        Xiaomi5Factory xiaomi5Factory = new Xiaomi5Factory();
        xiaomi5Factory.getXiaomi5();

        System.out.println("订购一台6:");
        Xiaomi6Factory xiaomi6Factory = new Xiaomi6Factory();
        xiaomi6Factory.getXiaomi6();
    }
}
