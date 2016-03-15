package polymorphism;

public class Apples {

	public static void main(String[] args) {
		
		// polymorphic array
		Food sondre[] = new Food[2];
		sondre[0]= new Potpie();
		sondre[1]= new Tuna();

		
		for (int x = 0; x<2; x++ ){
			sondre[x].eat();
		}

		Fatty sondre1 = new Fatty();
		
		
		sondre1.digest(sondre[0]);
	
	
	}

}
