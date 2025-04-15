package mediaPlayer;


public abstract class State {
    protected Player player;

    State(Player player) {
        this.player = player;
    }

    public abstract void stop();
    public abstract void play();
    public abstract void pause();

    public void next() {
        player.nextTrack();
    }

    public void previous() {
        player.previousTrack();
    }
}