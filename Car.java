
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Car {
    Image carImage;
    Image carStopImage;
    Image carRunnigRight;
    ImageIcon carImageIcon;
    int y;
    Car()
    {
        carImageIcon = new ImageIcon("Car_still.png");
        carStopImage = carImageIcon.getImage();

        carImageIcon = new ImageIcon("car.gif");
        carRunnigRight = carImageIcon.getImage();

        carImage = carStopImage;
        y=120;
    }
    void move(KeyEvent e) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        if(e.getKeyCode()==68)
        {
            y=y+5;
            carImage = carRunnigRight;
            AudioInputStream a = AudioSystem.getAudioInputStream(new File("car_drive_sound.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(a);
            clip.loop(-1);
        }
        else if(e.getKeyCode()==65)
        {
            y=y-5;
            carImage = carRunnigRight;
            AudioInputStream a = AudioSystem.getAudioInputStream(new File("car_drive_sound.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(a);
            clip.loop(-1);
        }
    }
}
