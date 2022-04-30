

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Helicopter {
    Image helimg;
    Image heliStopImage;
    Image heliRunnigRight;
    ImageIcon heliImageIcon;
    int x;
    Helicopter()
    {
        heliImageIcon = new ImageIcon("helicopter.png");
        heliStopImage = heliImageIcon.getImage();

        heliImageIcon = new ImageIcon("helicopter.png");
        heliRunnigRight = heliImageIcon.getImage();

        helimg = heliStopImage;
        x=120;
    }
    void helimove(KeyEvent e) throws Exception {
        if(e.getKeyCode()==39)
        {
            x=x+5;
            helimg = heliRunnigRight;
            AudioInputStream a2 = AudioSystem.getAudioInputStream(new File("helicopter.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(a2);
            clip.loop(-1);
        }
        else if(e.getKeyCode()==37)
        {
            x=x-5;
            helimg = heliRunnigRight;
            AudioInputStream a2 = AudioSystem.getAudioInputStream(new File("helicopter.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(a2);
            clip.loop(-1);
        }

    }
}

