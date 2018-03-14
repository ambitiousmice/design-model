package Command.simple;

/**
 * Created by AmbitiousMice on 2018/3/1.
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command1 command1 = new Command1(receiver);
        Command2 command2 = new Command2(receiver);
        Invoker invoker = new Invoker(command1,command2);
        invoker.executeCommand1();
        invoker.executeCommand2();
    }
}
