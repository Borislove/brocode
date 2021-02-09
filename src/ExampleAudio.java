import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExampleAudio {
    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {

        Scanner scanner= new Scanner(System.in);

        File file = new File("babys.wav");

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        clip.start();

        String response = scanner.next();
    }
}
