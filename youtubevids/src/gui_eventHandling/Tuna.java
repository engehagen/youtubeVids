package gui_eventHandling;

//Denne kommer ETTER GUI og GuiJFrame

import java.awt.FlowLayout;
import java.awt.event.ActionListener; // venter på brukeren skal gjøre noe(enter eller trykk)
import java.awt.event.ActionEvent; // events (trykk eller liknende)
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Tuna extends JFrame { //extenden lar oss bruke et window
	
	//lager noen texttfields
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;
	
	// constructor
	
	public Tuna(){
		super("The title of window");
		
		setLayout(new FlowLayout());
		
		// nå skal textfields addes
		
		item1 = new JTextField(16); // 10 er lenght
		add(item1);
		
		item2 = new JTextField("Enter text here: ");
		add(item2);
		
		item3 = new JTextField("uneditable", 20); // vi vil ikke at brukeren kan endre på dette
		item3.setEditable(false);
		add(item3);
		
		passwordField = new JPasswordField("Mypassword");
		add(passwordField);
		
		// må lage et actionlistenerobject. må legge til "brains" til itemene på skjermen.
		
		TheHandler handler = new TheHandler();
		
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		
		passwordField.addActionListener(handler);
		
		
		
		
		
	}
	
	// vil bygge handler inne i tuna, for da inheriter TheHandler alt fra Tuna.
	
	private class TheHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			
			String string = "";
			
			if(event.getSource()==item1){
				//hvis de klikket enterpå item1 textfieldet.
				string = String.format("Field 1: %s", event.getActionCommand());
			
			}else if(event.getSource()==item2){
				//hvis de klikket enterpå item1 textfieldet.
				string = String.format("Field 2: %s", event.getActionCommand());
			}else if(event.getSource()==item3){
				//hvis de klikket enterpå item1 textfieldet.
				string = String.format("Field 3: %s", event.getActionCommand());
			}else if(event.getSource()==passwordField){
				string = String.format("password field is : %s", event.getActionCommand());
			}
			
			JOptionPane.showMessageDialog(null, string);
	
	
		}
}
}


