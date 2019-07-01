package jFrame_event_listener_two_on_one;

import javax.swing.JButton;
import javax.swing.JFrame;





public class WelcomeFrame extends JFrame{
	
	public JButton color1;
	public JButton color2;
	
	public WelcomeFrame(String title,int height,int width)
	{
		this.setTitle(title);
		this.setSize(width, height);
		color1= new JButton("Red");
		color1.setBounds(100, 100, 140, 40);
		color2= new JButton("Blue");
		color2.setBounds(100, 200, 140, 40);
		this.add(color1);
		this.add(color2);
		this.setLayout(null);
		MyActionListener mal=new MyActionListener(this);
		color1.addActionListener(mal);
		color2.addActionListener(mal);
	}

}
