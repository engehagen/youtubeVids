package enumeration;

// endrer class til enum

public enum Tune {
	// variabler som aldri endres.
	// constants that are objects
	
	sondre("Nice","21"), 
	kelsey("Cutie", "10"),
	julia("Big mistake", "12"),
	nicole("Italian", "13"),
	candy("different", "14"),
	erin("iwish","16");
	
	private final String desc;
	private final String year;
	
	// må lage en enumeration constructor
	
	Tune(String description, String aar){
		desc = description;
		year = aar;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getYear(){
		return year;
	}

}
