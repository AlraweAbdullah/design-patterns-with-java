package mediaPlayer;

public class PlayingState extends State{
    PlayingState(Player player) {
        super(player);
    }

    @Override
    public void stop() {
        player.setState(new StoppedState(player));
        System.out.println("Stopped...");

    }

    @Override
    public void play() {
        throw new UnsupportedOperationException("Playing already...");
    }

    @Override
    public void pause() {
        player.setState(new PausedStated(player));
        System.out.println("Paused...");
    }
}
