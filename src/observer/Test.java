package observer;

import java.util.Date;

/**
 * Created by AmbitiousMice on 2018/2/28.
 */
public class Test {
    public static void main(String[] args){
        TaskTopic taskTopic = new TaskTopic();
        for(int i=0;i<10;i++){
            taskTopic.registerObserver(new WorkerObsever("work"+i));
        }
        taskTopic.publish("测试",new Date(),"这是一条测试数据");
    }
}
