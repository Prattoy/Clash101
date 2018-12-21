import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



class StartPanel extends JPanel implements ActionListener{
    public StartPanel(){
		super();
		 
		JLabel L=new JLabel("WELCOME TO CLASH OF CARS");
		JButton b1=new JButton("NEW GAME");
		JButton b2=new JButton("INSTRUCTIONS");
		JButton b3=new JButton("HIGH SCORES");
		JButton b4=new JButton("QUIT");
		
		L.setBounds(310,150,250,40);
		b1.setBounds(320,250,150,40); //x axis,y axis,width,height
		b2.setBounds(320,350,150,40);
		b3.setBounds(320,450,150,40);
		b4.setBounds(320,550,150,40);
		 
		
		add(L);
		add(b1);
		add(b4);
		add(b3);
		add(b2);
		
		//ButtonSensor bs=new ButtonSensor();
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		if((Game.button==1)||(Game.button==2)||(Game.button==3)||(Game.button==4))
		{
			//setVisible(false);
		}
		
		public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand()=="NEW GAME")
		{
			Game.button=1;
			System.out.println(Game.button);
			
		}
		if(ae.getActionCommand()=="INSTRUCTIONS")
		{
			Game.button=2;
			System.out.println(Game.button);
		}
		if(ae.getActionCommand()=="HIGH SCORES")
		{
			Game.button=3;
			System.out.println(Game.button);
		}
		if(ae.getActionCommand()=="QUIT")
		{
			Game.button=4;
			System.out.println(Game.button);
			System.exit(0);
		}
	}
		
	 }
	
}

class ButtonSensor implements ActionListener
{
	ButtonSensor() {}
	
	
}
