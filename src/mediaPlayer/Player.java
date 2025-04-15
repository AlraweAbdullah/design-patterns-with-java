package mediaPlayer;

import java.util.List;

public class Player {
    private State state = new StoppedState(this);
    private List<String> playlist;
    private String currentTrack;

    public Player(List<String> playlist) {
        this.playlist = playlist;
        currentTrack = playlist.getFirst();
    }

    public void nextTrack() {
        currentTrack = currentTrack.equals(playlist.getLast()) ? playlist.getFirst() : playlist.get(playlist.indexOf(currentTrack) + 1);
    }

    public void previousTrack() {
        currentTrack = currentTrack.equals(playlist.getFirst()) ? playlist.getLast() : playlist.get(playlist.indexOf(currentTrack) - 1);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void play() {
       state.play();
    }

    public void pause() {
        state.pause();
    }

    public void stop() {
        state.stop();
    }

    public String getCurrentTrack() {
        return currentTrack;
    }
}
