package Command.simple;

/**
 * Created by AmbitiousMice on 2018/3/1.
 */
public class Invoker {
    private Command command1;
    private Command command2;


    public Invoker(Command1 command1, Command2 command2) {
        this.command1 = command1;
        this.command2 = command2;
    }

    public void executeCommand1(){
        command1.execute();
    }

    public void executeCommand2(){
        command2.execute();
    }
}
