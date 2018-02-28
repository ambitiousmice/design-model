package observer;

import java.util.Date;

/**
 * Created by AmbitiousMice on 2018/2/28.
 */
public class WorkerObsever implements Observer {
    private String name;
    public WorkerObsever(String name) {
        this.name = name;
    }

    @Override
    public void update(String topic, Date publishDate, String publishContext) {
        System.out.println("Work："+this.name);
        System.out.println("话题："+topic);
        System.out.println("发布时间："+publishDate);
        System.out.println("发布内容："+publishContext);
        System.out.println("================================");
    }
}
