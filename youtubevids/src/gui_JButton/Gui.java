package gui_JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Gui extends JFrame {
	
	private JButton reg;
	private JButton custom;
	
	public Gui(){
		super("Sondres program"); // JFrame constructor
		
		setLayout(new FlowLayout());
		
		reg = new JButton("Vanlig knapp");
		add(reg);
		
		// custom picture, altså mitt eget knapp
		
		Icon b = new ImageIcon(getClass().getResource("button1.png"));
		Icon x = new ImageIcon(getClass().getResource("button2.png"));
		
		custom = new JButton("Vanløig knaåpp", b);
		custom.setRolloverIcon(x);
		add(custom);
		
		HandlerClass handler = new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
		
	}
	
	private class HandlerClass implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
			
			
		}
		
		
		
	}
	
	
	
	

}
