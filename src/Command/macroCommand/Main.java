package Command.macroCommand;

/**
 * Created by AmbitiousMice on 2018/3/1.
 */
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        MacroCommand macroCommand = new PhoneMacroCommand();
        PownerCommand pownerCommand = new PownerCommand(phone);
        ContactWIFICommand contactWIFICommand = new ContactWIFICommand(phone);
        PlayMusicCommand playMusicCommand = new PlayMusicCommand(phone);
        macroCommand.addCommand(pownerCommand);
        macroCommand.addCommand(contactWIFICommand);
        macroCommand.addCommand(playMusicCommand);
        macroCommand.execute();
    }
}
