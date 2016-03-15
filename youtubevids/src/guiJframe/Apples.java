package guiJframe;


import javax.swing.JFrame; // gir basic window features

public class Apples {

	public static void main(String[] args) {
		
		Tuna sondre = new Tuna();
		sondre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // hvordan jeg avslutter programmet
		
		// setter size for vinduet
		sondre.setSize(275, 180);
		
		sondre.setVisible(true);//så jeg kan se vinduet
	}

}
