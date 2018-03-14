package factory.factory_method;

import factory.Xiaomi6;

/**
 * Created by AmbitiousMice on 2018/2/28.
 */
//工厂方法模式
public class Xiaomi6Factory implements XiaomiFactory{
    @Override
    public Xiaomi6 getXiaomi(){
        return new Xiaomi6();
    }

}
