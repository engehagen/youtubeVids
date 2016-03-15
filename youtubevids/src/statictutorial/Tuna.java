package statictutorial;

public class Tuna {
	
	private String first;
	private String last;
	
	
	// static betyr at alle objektene deler en variabel.
	private static int members = 0;
	
	
	public Tuna(String fn, String ln){
		first = fn;
		last = ln;
		members ++;
		
		System.out.printf("constructor for %s %s, menbers in the club: %d\n", first, last, members);
		
	}
	
	public String getFirst(){
		return first;
	}

	public String getLast(){
		return last;
	}
	
	public static int getMembers(){
		return members;
	}
}
