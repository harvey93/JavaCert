package aAProbs;

public class TimeConversion {
	public static String timeString(int num){
		int hours = num / 60;
		int mins = num % 60;
		String res = "";
		if(mins == 0){
			return Integer.toString(hours) + ":00";
		} else {
			return Integer.toString(hours) + ":" + Integer.toString(mins);
		}
	}
}