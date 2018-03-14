package Command.simple;

/**
 * Created by AmbitiousMice on 2018/3/1.
 */
public class Command2 implements Command{
    private Receiver receiver;

    public Command2(Receiver receiver) {
        this.receiver = receiver;
    }


    @Override
    public void execute() {
        receiver.command2Action();
    }
}
