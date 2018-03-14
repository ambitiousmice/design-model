package Command.queueCommand;

import java.util.List;

/**
 * Created by AmbitiousMice on 2018/3/1.
 */
public class CommandQueue {
    private List<Command> queue;

    public void setQueue(List<Command> queue){
        this.queue = queue;
    }

    public void executeQueue(){
        for (Command command : queue){
            command.execute();
        }
    }
}
