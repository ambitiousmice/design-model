package Command.macroCommand;

/**
 * Created by AmbitiousMice on 2018/3/1.
 */
public class PlayMusicCommand implements Command {
    private Phone phone;

    public PlayMusicCommand(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void execute() {
        phone.playMusic();
    }
}
