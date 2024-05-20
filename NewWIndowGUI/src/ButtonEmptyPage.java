import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonEmptyPage implements ActionListener{

	JButton button3 = new JButton("Empty");
	
	ButtonEmptyPage() {
		button3.setBounds(150,240,200,40);
		button3.setFocusable(false);
		//button3.addActionListener(this); // See Explanation Below
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	// This code actually works completely,
	// But i wanted to use (frame.dispose),
	// Which i can't because i didn't create a frame here obviously DUMBASS.
	/*
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button3) {
			EmptyPage ep = new EmptyPage();
		}
		
	}*/
}
