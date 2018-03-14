package Command.macroCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AmbitiousMice on 2018/3/1.
 */
public class PhoneMacroCommand implements MacroCommand {
    private List<Command> macroCommandList;

    public PhoneMacroCommand() {
        this.macroCommandList = new ArrayList<Command>();
    }

    @Override
    public void addCommand(Command command){
        this.macroCommandList.add(command);
    }

    @Override
    public void removeCommand(Command command){
        this.macroCommandList.remove(command);
    }

    @Override
    public void execute() {
        for (Command command : macroCommandList){
            command.execute();
        }
    }
}
