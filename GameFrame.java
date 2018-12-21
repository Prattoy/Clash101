import java.awt.*;
import javax.swing.*;

class GameFrame extends JFrame {
	
    public GameFrame() {
        super("Clash of Cars");

        setSize(1000, 1200);
        setLayout(new FlowLayout());
		ImageIcon ic=new ImageIcon("coc.png");    
        this.setIconImage(ic.getImage());
    }
}
