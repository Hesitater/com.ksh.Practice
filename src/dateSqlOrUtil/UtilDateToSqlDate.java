package dateSqlOrUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDateToSqlDate {
	public static void main (String[] args) throws IllegalArgumentException {
		Date date = new Date();
		
		long timeInMilliSeconds = date.getTime();
		java.sql.Date date1 = new java.sql.Date(timeInMilliSeconds);
		System.out.println("SQL Date: "  + date1);
		
		System.out.println("-------------------------------");
		
		Date datea = new Date();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String formattedDate = simpleDateFormat.format(datea);
		java.sql.Date datea1 = java.sql.Date.valueOf(formattedDate);
		
		System.out.println("SQL Date: " + datea1);
		
	}
}
