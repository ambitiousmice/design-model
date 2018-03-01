package factory.simple_factory;

/**
 * Created by AmbitiousMice on 2018/3/1.
 */
public class Customer {
    public static void main(String[] args) {
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        System.out.println("订购一台2s:");
        xiaomiFactory.getXiaomi(2);
        System.out.println("订购一台4:");
        xiaomiFactory.getXiaomi(4);
        System.out.println("订购一台5:");
        xiaomiFactory.getXiaomi(5);
        System.out.println("订购一台6:");
        xiaomiFactory.getXiaomi(6);
    }

}
