package guiJframe;

// først må man importere masse drit
import java.awt.FlowLayout; // imports how things are placed
import javax.swing.JFrame; // JFrame gir alle basic windows features. minimize, maximize osv osv,.
import javax.swing.JLabel; // allows to output text and images on screen


public class Tuna extends JFrame{ // må inherite alt fra JFrame som er importert over.
	
	
	private JLabel item1; // JLabel er typen object
	
	public Tuna(){
		// first line is the title of window
		super("The title bar");
		
		setLayout(new FlowLayout()); // dette gir default layout
		
		// item er text på skjermen
		item1 = new JLabel("This is a sentence ");
		
		//scrollbox når man hoverer over item1
		item1.setToolTipText("This is gonna show up on hover");
		
		// må adde itemet til windowet.
		add(item1);
		
		
		
		
	}
	
	
	
	
	
	
	
	
}


