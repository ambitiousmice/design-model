package decorator;

/**
 * Created by AmbitiousMice on 2018/2/28.
 */
//角色类型：战士
public class Warrior extends Role {
    public Warrior() {
        item  = "warrior";
    }

    @Override
    public int price() {
        return 0;
    }
}
