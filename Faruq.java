import java.util.Calendar;

class Ab{
	public static void weekDays(){
		String [] daysOfWeek = {
			"Sunday",
			"Monday",
			"Tuesday",
			"Wednesday",
			"Thursday",
			"Friday",
			"Saturday"
			};
			for (int i = 0; i<daysOfWeek.length; i++)
			System.out.println(daysOfWeek[i]);

		}
	}

public class Faruq extends Ab{
	public static void main(String [] args){
		Calendar now = Calendar.getInstance();
		
		System.out.println("Todays date is: " +(now.get(Calendar.MONTH)
		+1
		+"-"
		+now.get(Calendar.DATE)
		+"-"
		+now.get(Calendar.YEAR)
		));
		
		String [] strDays = new String[] {
			"Sunday",
			"Monday",
			"Tuesday",
			"Wednesday",
			"Thursday",
			"Friday",
			"Saturday"};
			
			System.out.println("Today is: "+ strDays[now.get(Calendar.DAY_OF_WEEK)-1]);
			System.out.println("\nBelow are the days of the week: \n");
			weekDays();
	}
}

