import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Joe on 5/29/2017.
 */
public class ApplicationWindow extends JFrame {
    JMenuBar menuBar;
    JMenu resMenu;
    GraphicsDevice device;
    public ApplicationWindow(GraphicsDevice graphicsDevice){
        super();
        init(graphicsDevice);
    }
    JPanel main;
    JPanel mainMenu;
    public void init(GraphicsDevice graphicsDevice){
        device = graphicsDevice;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        device.setFullScreenWindow(this);
        main = new JPanel();
        main.setLayout(null);
        add(main);
        setSize(device.getDisplayMode().getWidth(), device.getDisplayMode().getHeight());
        main.setSize(this.getWidth(), this.getHeight());
        main.setBounds(0,0, device.getDisplayMode().getWidth(), device.getDisplayMode().getHeight());
        main.setVisible(true);
        mainMenu = new MainMenu(graphicsDevice, this);
        main.add(mainMenu);
        mainMenu.setVisible(true);
        mainMenu.setBounds(0,0,device.getDisplayMode().getWidth(), device.getDisplayMode().getHeight());
        pack();
    }

}
