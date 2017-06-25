package aAProbs;

public class TimeConversion {
	public static String timeString(int num){
		int hours = num / 60;
		int mins = num % 60;
		String res = "";
		if(mins == 0){
			return Integer.toString(hours) + ":00";
		}else if(mins < 10){
			return Integer.toString(hours) + ":0" + Integer.toString(mins);
		} else {
			return Integer.toString(hours) + ":" + Integer.toString(mins);
		}
	}
}
