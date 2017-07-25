package sectionTests;

public enum Color {
	Red("RED", 1), Blue("BLUE", 2), Green("GREEN",3);

	private String color;
	private int value;

	Color(String color, int value) {
		this.color = color;
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	


}