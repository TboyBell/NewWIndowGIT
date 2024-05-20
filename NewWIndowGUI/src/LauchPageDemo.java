import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LauchPageDemo implements ActionListener{

	
	JFrame frame = new JFrame();
	JButton button = new JButton("New-Window");                 
	JButton button2 = new JButton("Exit-Window");                             
	ButtonEmptyPage bp = new ButtonEmptyPage();
	
	LauchPageDemo () {
		
		button.setBounds(150,160,200,40);
		button.setFocusable(false);
		button.addActionListener(this);
		
		button2.setBounds(150,200,200,40);
		button2.setFocusable(false);
		button2.addActionListener(this);
		
		// This is under the circumstances that,
		// I choose to declare and define the button3 here 
		// So I could use (Frame.dispode),
		// When I'm Creating  the Action Listener.
		bp.button3.addActionListener(this); 
		frame.add(bp.button3);
		
		
		frame.add(button2);
		frame.add(button);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		// Pls See WindowListerner Doc in Project File For Explaining.
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent WindowEvent) {
				exitApplication();
			} } );
		
		
	}

	public void exitApplication() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.dispose();
		
	}
	@Override
	 public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            frame.dispose(); // Close the current frame
            NewWindow window = new NewWindow(); // Open a new window
        } else if (e.getSource() == button2) {
        	exitApplication(); // Exit the application
        }
        //Because we wanted to Use (Frame.Dispose)
        else if (e.getSource()==bp.button3) {
        	frame.dispose();
        	EmptyPage ep = new EmptyPage();
        }

	}
	
}
