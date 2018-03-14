package Command.macroCommand;

/**
 * Created by AmbitiousMice on 2018/3/1.
 */
public class PownerCommand implements Command {
    private Phone phone;

    public PownerCommand(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void execute() {
        phone.pownerOn();
    }
}
