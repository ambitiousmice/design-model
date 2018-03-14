package factory.factory_method;

import factory.Xiaomi4;

/**
 * Created by AmbitiousMice on 2018/2/28.
 */
//工厂方法模式
public class Xiaomi4Factory implements XiaomiFactory{
    @Override
    public Xiaomi4 getXiaomi(){
        return new Xiaomi4();
    }

}
