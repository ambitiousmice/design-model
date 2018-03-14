package Command.queueCommand;

/**
 * Created by AmbitiousMice on 2018/3/1.
 */
public class ApplePownerCommand implements Command {
    private Apple apple;

    public ApplePownerCommand(Apple apple) {
        this.apple = apple;
    }

    @Override
    public void execute() {
        this.apple.powner();
    }
}
