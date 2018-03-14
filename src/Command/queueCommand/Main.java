package Command.queueCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AmbitiousMice on 2018/3/1.
 */
public class Main {
    public static void main(String[] args) {
        List<Command> queue = new ArrayList<Command>();
        Xiaomi xiaomi = new Xiaomi();
        Apple apple = new Apple();
        XiaomiPownerCommand xiaomiPowner = new XiaomiPownerCommand(xiaomi);
        ApplePownerCommand applePowner = new ApplePownerCommand(apple);
        queue.add(xiaomiPowner);
        queue.add(applePowner);
        CommandQueue commandQueue = new CommandQueue();
        commandQueue.setQueue(queue);
        commandQueue.executeQueue();
    }
}
