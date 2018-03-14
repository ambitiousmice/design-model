package Command.macroCommand;

/**
 * Created by AmbitiousMice on 2018/3/1.
 */
//宏命令
public interface MacroCommand extends Command {
    void addCommand(Command command);

    void removeCommand(Command command);
}
