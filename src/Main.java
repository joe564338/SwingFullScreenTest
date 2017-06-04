import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Joe on 5/29/2017.
 */
public class Main {
    static GraphicsDevice device = GraphicsEnvironment
            .getLocalGraphicsEnvironment().getScreenDevices()[0];
    static ApplicationWindow aw;
    public static void main(String [] args){
        aw = new ApplicationWindow(device);
        aw.setVisible(true);
        aw.setState(Frame.ICONIFIED);
        try{
            Thread.sleep(5);
        } catch(InterruptedException e){
            System.out.println("Interrupt");

        }
        aw.setState(Frame.NORMAL);
        aw.setFocusable(true);
        aw.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getExtendedKeyCode() == KeyEvent.VK_ESCAPE)
                {
                    System.out.println(aw.mainMenu.isVisible());
                    //code to execute if escape is pressed
                    if(aw.mainMenu.isVisible()) {
                        System.out.println("Disappearing");
                        aw.mainMenu.setVisible(false);
                    } else {
                        System.out.println("Appearing");
                        aw.mainMenu.setVisible(true);
                    }
                }
            }
        });
    }


}
