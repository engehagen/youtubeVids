package finalTutorial;

public class Tuna {
	private int sum;
	
	// kan ikke modifisere den etter den er deklarert
	private final int NUMBER;
	
	
	public Tuna(int x){
		NUMBER = x;
		//DETTE kan bare gjøres en gang. 
	}
	
	public void add(){
		sum+=NUMBER;
	}
	
	public String toString(){
		return String.format("Sum = %d\n", sum);
	}
	
}
