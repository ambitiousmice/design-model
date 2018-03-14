package factory.factory_method;

import factory.Xiaomi2S;

/**
 * Created by AmbitiousMice on 2018/2/28.
 */
//工厂方法模式
public class Xiaomi2SFactory implements XiaomiFactory{
    @Override
    public Xiaomi2S getXiaomi(){
        return new Xiaomi2S();
    }

}
