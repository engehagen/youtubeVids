package enumeration;

import java.util.EnumSet;

public class Apples {
	public static void main(String[] args){
		for(Tune people: Tune.values()){
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(),people.getYear());
		}
		System.out.println("\nAnd now for the range of constants!!!\n");
		//the meat of the tutorial
		//forloop for range of enumaratione
		for(Tune people : EnumSet.range(Tune.kelsey, Tune.candy)){
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(),people.getYear());
		}
	}

}
