package themeleaf.demo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class demo {

	public static void main(String[] args) {
		//Calendar instance3 = Calendar.getInstance();
		//instance3.set(2018,8,26);
		////instance3.set(2018,9,2);
		//instance3.add(Calendar.DAY_OF_MONTH,7);
		//System.out.println(instance3.get(Calendar.MONTH)+1);
		//System.out.println(instance3.get(Calendar.DAY_OF_MONTH));
		//
		////bug


		LocalDate today = LocalDate.of(2018, 8, 26);
		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		System.out.println(nextWeek.getMonth());
		System.out.println(nextWeek.getDayOfMonth());
	}


}
