package Command.queueCommand;

/**
 * Created by AmbitiousMice on 2018/3/1.
 */
public class XiaomiPownerCommand implements Command {
    private Xiaomi xiaomi;

    public XiaomiPownerCommand(Xiaomi xiaomi) {
        this.xiaomi = xiaomi;
    }

    @Override
    public void execute() {
        this.xiaomi.powner();
    }
}
