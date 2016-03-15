package statictutorial;

public class Apples {
	public static void main(String[] args){
		Tuna member1 = new Tuna("Megan", "Fox");
		
		Tuna member2 = new Tuna("Natalie", "Portman");
		
		Tuna member3 = new Tuna("Taylor", "Swift");
		
		
		System.out.println();
		System.out.println(member2.getFirst());
		System.out.println(member2.getLast());
		System.out.println(member2.getMembers());
		
		
		System.out.println(Tuna.getMembers());
		
		
	}

}
