package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sound_Effects_machine implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();

	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		JPanel panel = new JPanel();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.pack();
		
		
		// TODO Auto-generated method stub
		frame.add(panel);
	}

	private void playSound(String fileName) {
		

		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));

		sound.play();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.equals(button1)){
		// TODO Auto-generated method stub
playSound("sound1.wav");
	}
		if (buttonPressed.equals(button2)){
			// TODO Auto-generated method stub
	playSound("sawing-wood-daniel_simon.wav");
		}
		if (buttonPressed.equals(button4)){
			// TODO Auto-generated method stub
	playSound("sound3.wav");
		}
		if (buttonPressed.equals(button3)){
			// TODO Auto-generated method stub
	playSound("sound2.wav");
		}
}
	}
