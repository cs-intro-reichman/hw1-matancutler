// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		String time = args[0];
		String Nminutes;
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		
		if (minutes < 10)
		{
			Nminutes = "0" + minutes;
			
		}
		else
		{
			Nminutes = minutes + "";
		}
		if (hours > 12)
		{
			System.out.println((hours - 12) + ":" + Nminutes + "PM");
		}
		else
		{
			System.out.println(hours + ":" + Nminutes + "AM");
		}
	}
}