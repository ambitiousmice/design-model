package factory.factory_method;

import factory.Xiaomi5;

/**
 * Created by AmbitiousMice on 2018/2/28.
 */
//工厂方法模式
public class Xiaomi5Factory implements XiaomiFactory{
    @Override
    public Xiaomi5 getXiaomi(){
        return new Xiaomi5();
    }

}
