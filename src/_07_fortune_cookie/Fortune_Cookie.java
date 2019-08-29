package _07_fortune_cookie;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_Cookie implements ActionListener {
public void showButton( ) {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	frame.setVisible(true);
    frame.add(button);
    frame.pack();
    button.addActionListener( this);

	  
	System.out.println("Button Clicked");
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
int random = new Random().nextInt(5);
	JOptionPane.showMessageDialog(null, "Woohoo");
	if (random == 0) {
		JOptionPane.showMessageDialog(null, "Be on the alert to recognize your prime at whatever time of your life it may occur.");
	}
	else if (random == 1) {
		JOptionPane.showMessageDialog(null, "Your road to glory will be rocky, but fulfilling.");
	}
	else if (random == 2) {
		JOptionPane.showMessageDialog(null, "Courage is not simply one of the virtues, but the form of every virtue at the testing point.");
	}
	else if (random == 3) {
		JOptionPane.showMessageDialog(null, "Patience is your alley at the moment. Don’t worry!");
	}
	else if (random == 4) {
		JOptionPane.showMessageDialog(null, "Don’t worry about money. The best things in life are free.");
	}
}
}
