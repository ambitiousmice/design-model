package decorator;

/**
 * Created by AmbitiousMice on 2018/2/28.
 */
public class Test {
    public static void main(String[] args){
        Role warrior = new Warrior();
        warrior = new Clothes(warrior);
        warrior = new Weapon(warrior);
        System.out.println("装备："+warrior.getItem());
        System.out.println("价格："+warrior.price());
    }
}