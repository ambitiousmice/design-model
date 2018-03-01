package factory.simple_factory;

import factory.*;

/**
 * Created by AmbitiousMice on 2018/2/28.
 */
//简单工厂方法
public class XiaomiFactory {

    public Xiaomi getXiaomi(int type) {
        switch (type) {
            case 2 : return new Xiaomi2S();
            case 4 : return new Xiaomi4();
            case 5 : return new Xiaomi5();
            case 6 : return new Xiaomi6();
            default:break;
        }
        return null;
    }
}
