package Command.simple;

/**
 * Created by AmbitiousMice on 2018/3/1.
 */
public class Command1 implements Command{
    private Receiver receiver;

    public Command1(Receiver receiver) {
        this.receiver = receiver;
    }


    @Override
    public void execute() {
        receiver.command1Action();
    }
}
