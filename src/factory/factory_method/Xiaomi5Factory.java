package factory.factory_method;

import factory.Xiaomi5;

/**
 * Created by AmbitiousMice on 2018/2/28.
 */
//工厂方法模式
public class Xiaomi5Factory {
    public Xiaomi5 getXiaomi5(){
        return new Xiaomi5();
    }

}
