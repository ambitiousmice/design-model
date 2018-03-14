package Command.macroCommand;

/**
 * Created by AmbitiousMice on 2018/3/1.
 */
public class ContactWIFICommand implements Command {
    private Phone phone;

    public ContactWIFICommand(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void execute() {
        phone.contactWIFI();
    }
}
