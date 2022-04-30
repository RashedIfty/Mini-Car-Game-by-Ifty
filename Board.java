import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Board extends JPanel
{
    Image background;
    Car car = new Car();
    Helicopter helicopter = new Helicopter();
    Board()
    {
        setFocusable(true);
        ImageIcon i = new ImageIcon("Back2.gif");
        background = i.getImage();

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e)
            {
                super.keyPressed(e);
                try
                {
                    helicopter.helimove(e);
                }
                catch (LineUnavailableException ex)
                {
                    ex.printStackTrace();
                }
                catch (UnsupportedAudioFileException ex)
                {
                    ex.printStackTrace();
                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }
                try
                {
                    car.move(e);
                }
                catch (LineUnavailableException ex)
                {
                    ex.printStackTrace();
                }
                catch (UnsupportedAudioFileException ex)
                {
                    ex.printStackTrace();
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            @Override
            public void keyReleased(KeyEvent e)
            {
                super.keyReleased(e);
                car.carImage = car.carStopImage;
            }

        });

    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawImage(background, 0,0,this);
        g.drawImage(car.carImage, car.y,360,this);
        g.drawImage(helicopter.helimg, helicopter.x,0,this);
        repaint();
    }
}
