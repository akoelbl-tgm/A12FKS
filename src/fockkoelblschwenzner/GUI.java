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
 * @version GUI für Verschlüsselung
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
		
		
		
		this.enShiftCipher = new JButton("ShiftCipher verschlüsseln");
		this.deShiftCipher = new JButton("ShiftCiper entschlüsseln");
		this.enKeyWordCipher = new JButton("KeyWordCipher verschlüsseln");
		this.deKeyWordCipher = new JButton("KeyWordCipher entschlüsseln");
		this.enSubstitutionCipher = new JButton("SubstitutionCipher verschlüsseln");
		this.deSubstitutionCipher = new JButton("SubstitutionCipher entschlüsseln");
		this.enMonoalphabeticCipher = new JButton("MonoalphabeticCipher verschlüsseln");
		this.deMonoalphabeticCipher = new JButton("MonoalphabeticCipher entschlüsseln");
		
		
		this.f1 = new JFrame("Verschlüsselung");
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
