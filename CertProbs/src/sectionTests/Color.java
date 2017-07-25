package sectionTests;

public enum Color {
	Red("RED"), Blue("Blue"), Green("GREEN");

	String color = null;

	Color(String color) {
		this.color = color;
	}

	public int getColorCode(Color color) {
		int ret = -1;
		switch (color) {
		case Red:
			ret = 1;
			break;
		case Blue:
			ret = 2;
			break;
		case Green:
			ret = 3;
			break;

		default:
			throw new RuntimeException("Illegal Color");
		}
		return ret;
	}
}
