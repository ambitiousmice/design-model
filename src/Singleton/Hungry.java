package Singleton;

/**
 * Created by AmbitiousMice on 2018/3/1.
 */
//饿汉式
public class Hungry {
    private Hungry(){};
    private static final Hungry HUNGRY = new Hungry();

    public static Hungry getInstance(){
        return HUNGRY;
    }
}
