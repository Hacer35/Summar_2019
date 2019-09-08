package Assignments_02;

public class Task04_HTTPSstatusCode {
	public static void main(String[] args) {
		
		int StatusCode = 404;
		if (StatusCode == 404);
		System.out.println("Not Found");
		
		//another way:
		
		int sc = 200;
		String fresult = "Invalid status code";
		if (sc == 200) {
			fresult = "ok";
		}if (sc == 201) {
			fresult = "created";
		}
		if (sc == 404) {
			fresult = "not found";
		}
		System.out.println("status code "+sc+" is : " +fresult );
		
	}

}
