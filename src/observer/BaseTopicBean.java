package observer;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by AmbitiousMice on 2018/2/28.
 */
public abstract class BaseTopicBean {
    private List<Observer> observerList;
    private String topic;
    private Date publishDate;
    private String publishContext;

    public List<Observer> getObserverList() {

        if(observerList==null){
                synchronized (this){
                this.observerList = new ArrayList<Observer>();
            }
        }
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getPublishContext() {
        return publishContext;
    }

    public void setPublishContext(String publishContext) {
        this.publishContext = publishContext;
    }
}
