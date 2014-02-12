import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author Marc Schwenzner
 * 
 * @since 12.02.2014
 * 
 * @version GUI f�r Verschl�sselung
 */

//Haahdhd
public class GUI {
	
	public JButton enShiftCipher;
	public JButton deShiftCipher;
	public JButton enKeyWordCipher;
	public JButton deKeyWordCipher;
	public JButton enSubstitutionCipher;
	public JButton deSubstitutionCipher;
	public JButton enMonoalphabeticCipher;
	public JButton deMonoalphabeticCipher;
	
	public JTextArea ta;
	public JLabel l;
	
	public JPanel buttons;
	
	public JFrame f1;
	
	public GUI(){
		
		
		
		this.enShiftCipher = new JButton("ShiftCipher verschl�sseln");
		this.deShiftCipher = new JButton("ShiftCiper entschl�sseln");
		this.enKeyWordCipher = new JButton("KeyWordCipher verschl�sseln");
		this.deKeyWordCipher = new JButton("KeyWordCipher entschl�sseln");
		this.enSubstitutionCipher = new JButton("SubstitutionCipher verschl�sseln");
		this.deSubstitutionCipher = new JButton("SubstitutionCipher entschl�sseln");
		this.enMonoalphabeticCipher = new JButton("MonoalphabeticCipher verschl�sseln");
		this.deMonoalphabeticCipher = new JButton("MonoalphabeticCipher entschl�sseln");
		
		
		this.f1 = new JFrame("Verschl�sselung");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setSize(300,300);
		f1.setLayout(new BorderLayout());
		
		
		buttons.setLayout(new GridLayout(4,2));
		buttons.add(enShiftCipher);
		buttons.add(deShiftCipher);
		buttons.add(enKeyWordCipher);
		buttons.add(enShiftCipher);
		buttons.add(enShiftCipher);
		buttons.add(enShiftCipher);
		buttons.add(enShiftCipher);
		buttons.add(enShiftCipher);
		
		
	}

	
}
