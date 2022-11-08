package DateApi;

import java.time.LocalDate;

public class Demo {
	public static void main(String[] args) {
		LocalDate date= LocalDate.now();//current date
		LocalDate date0= date.plusDays(1);//before date
		LocalDate date1= date.minusDays(1);//plus current date

		System.out.println(date + " " + date0 + " " + date1 );
	}

}
