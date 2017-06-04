import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Map;

/**
 * Created by Joe on 5/30/2017.
 */
public class MainMenu extends JPanel{
    JButton play;
    JButton settings;
    JButton quit;
    GraphicsDevice graphicsDevice;
    private int allignment;
    ApplicationWindow aw;
    public MainMenu(GraphicsDevice graphicsDevice, ApplicationWindow aw){
        super();
        this.aw = aw;
        init(graphicsDevice);
    }
    public void init(GraphicsDevice graphicsDevice){
        setLayout(null);
        allignment = graphicsDevice.getDisplayMode().getWidth()/7;
        this.graphicsDevice = graphicsDevice;
        play = new JButton("Play");
        settings = new JButton("Settings");
        quit = new JButton("Quit");
        add(play);
        add(settings);
        add(quit);
        play.setBounds(allignment, graphicsDevice.getDisplayMode().getHeight()/3, 300, 100);
        play.setVisible(true);
        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                aw.setFocusable(true);
            }
        });
        settings.setBounds(allignment, graphicsDevice.getDisplayMode().getHeight()/3+100, 300, 100);
        settings.setVisible(true);
        quit.setBounds(allignment, graphicsDevice.getDisplayMode().getHeight()/3+200, 300, 100);
        quit.setVisible(true);
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
