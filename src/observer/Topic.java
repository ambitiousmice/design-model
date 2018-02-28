package observer;

import java.util.Date;
import java.util.List;

/**
 * Created by AmbitiousMice on 2018/2/28.
 */
public interface Topic {

    //注册观察者
    void registerObserver(Observer observer);

    //移除观察者
    void removeObserver(Observer observer);

    //通知观察者
    void notifyObservers(List<Observer> observerList);

    //发布消息
    void publish(String topic, Date publishDate, String publishContext);

}
