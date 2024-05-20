import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EmptyPage {

	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	EmptyPage() {
		
		
		
		
		ImageIcon icon = new ImageIcon("Wallpaper.jpg");
		label.setBounds(0,0,500,500);
		label.setText("Merry Christmas");
		label.setForeground(Color.PINK);
		label.setFont(new Font("Comic Sans MS", Font.PLAIN,50));
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setIcon(icon);
		label.setLayout(new BorderLayout());
				
		
		
		frame.add(label);
		//frame.setSize(500, 500);
		frame.pack();
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

}
