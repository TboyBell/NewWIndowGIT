import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {

	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	
	NewWindow() {
		
		ImageIcon icon = new ImageIcon("fuc.png");
		label.setBounds(0,0,500,500);
		label.setText("STUPID");
		label.setIcon(icon);
		label.setLayout(new BorderLayout());
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		
		
		
		frame.add(label);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
