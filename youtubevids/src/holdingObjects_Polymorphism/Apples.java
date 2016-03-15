package holdingObjects_Polymorphism;

public class Apples {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Fish f = new Fish();
		Animal[] thelist = new Animal[2];
		
		thelist[0]=d;
		thelist[1]=f;
		
		for(Animal x : thelist){
			x.noise();
		}
	
	}

}
