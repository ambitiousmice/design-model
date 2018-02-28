package observer;

import java.util.Date;
import java.util.List;

/**
 * Created by AmbitiousMice on 2018/2/28.
 */
public class TaskTopic extends BaseTopicBean implements Topic {
    @Override
    public void registerObserver(Observer observer) {
        if(this.getObserverList().contains(observer)){
            return;
        }
        this.getObserverList().add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.getObserverList().remove(observer);
    }

    @Override
    public void notifyObservers(List<Observer> observerList) {
        if (observerList==null){
            return;
        }
        for (Observer observer : observerList){
            observer.update(this.getTopic(),this.getPublishDate(),this.getPublishContext());
        }
    }

    @Override
    public void publish(String topic, Date publishDate, String publishContext) {
        this.setTopic(topic);
        this.setPublishDate(publishDate);
        this.setPublishContext(publishContext);
        notifyObservers(this.getObserverList());
    }
}
