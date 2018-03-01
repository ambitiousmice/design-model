package decorator;

/**
 * Created by AmbitiousMice on 2018/2/28.
 */
//角色
public abstract class Role {
    //装备
     String item = "";

     public String getItem(){
         return item;
     }

     //价格
     public abstract int price();
}
