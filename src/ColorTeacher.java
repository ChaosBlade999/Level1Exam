import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class ColorTeacher implements ActionListener {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton b1=new JButton();
	JButton b2=new JButton();
	JButton b3=new JButton();
	JButton b4=new JButton();
	public static void main(String[] args) {
		ColorTeacher c=new ColorTeacher();
		c.Start();
	}
	
	public void Start(){
		b1.setBackground(Color.yellow);
		b2.setBackground(Color.red);
		b3.setBackground(Color.blue);
		b4.setBackground(Color.green);
		b1.setOpaque(true);
		b2.setOpaque(true);
		b3.setOpaque(true);
		b4.setOpaque(true);
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(b1)){
			speak("yellow");
			System.out.println("yellow");
		}
		if(e.getSource().equals(b2)){
			speak("red");
			System.out.println("red");
		}
		if(e.getSource().equals(b3)){
			speak("blue");
			System.out.println("blue");
		}
		if(e.getSource().equals(b4)){
			speak("green");
			System.out.println("green");
		}
	}
	
	void speak(String words){
		try {
			Runtime.getRuntime().exec("say " + words);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
