package decorator;

/**
 * Created by AmbitiousMice on 2018/2/28.
 */

//武器
public class Weapon extends PropsDecorator {
    private Role role;

    public Weapon(Role role) {
        this.role = role;
    }

    @Override
    public String getItem() {
        return role.getItem()+" 开天";
    }

    @Override
    public int price() {
        return role.price()+1;
    }
}
