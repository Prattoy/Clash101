import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class StartPanel extends JPanel {
    public StartPanel(){
		super();
		
		JLabel L=new JLabel("WELCOME TO CLASH OF CARS");
		JButton b1=new JButton("NEW GAME");
		JButton b2=new JButton("INSTRUCTION");
		JButton b3=new JButton("HIGH SCORE");
		JButton b4=new JButton("QUIT");
		
		L.setBounds(390,150,250,40);
		b1.setBounds(400,250,150,40);
		b2.setBounds(400,350,150,40);
		b3.setBounds(400,450,150,40);
		b4.setBounds(400,550,150,40);
		 
		
		add(L);
		add(b1);
		add(b4);
		add(b3);
		add(b2);
		
		ButtonSensor bs=new ButtonSensor();
		b1.addActionListener(bs);
		b2.addActionListener(bs);
		b3.addActionListener(bs);
		b4.addActionListener(bs);

		setLayout(null);		
	 }
	
}

class ButtonSensor implements ActionListener
{
	ButtonSensor(){}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand()=="NEW GAME")
		{
			GameFrame gf2=new GameFrame();
			GamePanel gp2=new GamePanel();
			
			gf2.setVisible(true);
			gf2.setDefaultCloseOperation(gf2.EXIT_ON_CLOSE);
			gf2.setContentPane(gp2);


			gp2.setFocusable(true);
			gp2.requestFocusInWindow();
			gp2.move();
			
		}
		if(ae.getActionCommand()=="INSTRUCTION")
		{
			JOptionPane.showMessageDialog(null, "There are two types of cars. Blue one is yours. You can move the car by using your keyboards 'UP','DOWN','RIGHT' and 'LEFT' buttons. Happy Gaming ;)","Instruction", JOptionPane.QUESTION_MESSAGE);
		}
		if(ae.getActionCommand()=="HIGH SCORE")
		{
			 JOptionPane.showMessageDialog(null, "HighScore : "+Game.highscore, "High Score", JOptionPane.INFORMATION_MESSAGE);
		}
		if(ae.getActionCommand()=="QUIT")
		{
			System.exit(0);
		}
	}
}

