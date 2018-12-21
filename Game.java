import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Game implements Runnable {
    static int bx;
    static int by;
    static int o1x;
    static int o1y;
    static int o2x;
    static int o2y;
    static int o3x;
    static int o3y;
    static int o4x;
    static int o4y;
    static int o5x;
    static int o5y;
    static int rn1;
    static int rn2;
    static int rn3;
    static int rn4;
    static int rn5;
    static int speed = 10;
    static int score = 0;
    static boolean stat;
	static int rdecrease=0;
	static int button=0;
	static int highscore;
    public static void main(String[] args) {
        bx = 473;
        by = 830;
        o1x = 293;
        o1y = 0;
        o2x = 383;
        o2y = 0;
        o3x = 473;
        o3y = 0;
        o4x = 563;
        o4y = 0;
        o5x = 653;
        o5y = 0;

        SwingUtilities.invokeLater(new Game());;
    }

    @Override
    public void run() {
		
		GameFrame gf = new GameFrame();
		
		//GamePanel gp = new GamePanel();
		
        gf.setVisible(true);
        gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		StartPanel sp=new StartPanel();
		gf.setContentPane(sp);
    }
}


