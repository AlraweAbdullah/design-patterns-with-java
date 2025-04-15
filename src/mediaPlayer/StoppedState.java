package mediaPlayer;

public class StoppedState extends State {
    public StoppedState(Player player) {
        super(player);
    }

    @Override
    public void stop() {
        throw new UnsupportedOperationException("Stopped already...");
    }

    @Override
    public void play() {
        player.setState(new PlayingState(player));
        System.out.println("Playing{" + player.getCurrentTrack() + "}") ;
    }

    @Override
    public void pause() {
        player.setState(new PausedStated(player));
        System.out.println("Paused...");
    }
}
