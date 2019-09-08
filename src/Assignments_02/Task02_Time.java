package Assignments_02;

public class Task02_Time {
	public static void main(String[] args) {
		
		int hour = 20;
		int minute = 11;
		int second = 12;
		String amOrPm = "";
		if (hour > 12) {
			amOrPm= "pm";
		}
		if (hour<12) {
			amOrPm = "am";
		}
		System.out.println(hour + ":" + minute + ":" + second +" " + amOrPm);
		
	}

}
