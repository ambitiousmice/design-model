package decorator;

/**
 * Created by AmbitiousMice on 2018/2/28.
 */

//衣服
public class Clothes extends PropsDecorator {
    private Role role;

    public Clothes(Role role) {
        this.role = role;
    }

    @Override
    public String getItem() {
        return role.getItem()+" 爆裂铠甲";
    }

    @Override
    public int price() {
        return role.price()+99;
    }
}
