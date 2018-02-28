package observer;

import java.util.Date;

/**
 * Created by AmbitiousMice on 2018/2/28.
 */
//观察者
public interface Observer {
    //接收并更新已发布信息
    void update(String topic, Date publishDate, String publishContext);
}
