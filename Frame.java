import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
//Rashedul Arefin Ifty
//C211032

public class Frame
{
    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        JFrame frame = new JFrame("Car Game");
        frame.setSize(1024, 549);
        frame.add(new Board());
        frame.setResizable(false);
        frame.setVisible(true);
        /*AudioInputStream a = AudioSystem.getAudioInputStream(new File("bs.wav"));
        Clip clip = AudioSystem.getClip();
        clip.open(a);
        clip.loop(clip.LOOP_CONTINUOUSLY);*/
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}