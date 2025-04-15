package mediaPlayer;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<String> tracks = Arrays.asList(
                "Bohemian Rhapsody - Queen",
                "Shape of You - Ed Sheeran",
                "Blinding Lights - The Weekend"
        );
        var player = new Player(tracks);
        player.play();
        player.stop();
        player.nextTrack();
        player.nextTrack();
        player.nextTrack();
        player.nextTrack();
        player.nextTrack();
        player.previousTrack();
        player.play();
    }
}
