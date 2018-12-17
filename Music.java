import javax.sound.sampled.*;
import java.io.*;
/**
 * Ended up being unimportant as I couldn't get it to work :(
 */
public class Music {
    private Clip clip;
    File music = new File ("watersounds.wav");
    public Music() {
    }

    public void run () {
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(music);
            clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
        } catch(Exception e) {
            
        }
    }
}