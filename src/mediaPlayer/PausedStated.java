package mediaPlayer;

public class PausedStated extends State {
    public PausedStated(Player player) {
        super(player);
    }

    @Override
    public void stop() {
        player.setState(new StoppedState(player));
        System.out.println("Stopped...");
    }

    @Override
    public void play() {
        player.setState(new PlayingState(player));
        System.out.println("Playing{" + player.getCurrentTrack() + "}");
    }

    @Override
    public void pause() {
        throw new UnsupportedOperationException("Paused already...");
    }
}
