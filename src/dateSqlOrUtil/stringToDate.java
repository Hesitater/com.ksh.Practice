package dateSqlOrUtil;

import java.sql.Date;
import java.text.ParseException;

public class stringToDate {
	public static void main(String[] args) throws Exception {
		
		//String -> java.sqp.Date 변환
		
		String day1 = "1994-11-22";  //형식을 지켜야함
		java.sql.Date sqldate = java.sql.Date.valueOf(day1);
		
		//String -> java.sql.Timestamp 변환
		String day2 = "1994-11-22 11:22:30.0"; //형식을 지켜야함
		java.sql.Timestamp sqltimestamp = java.sql.Timestamp.valueOf(day2);
		
		//String -> java.util.Date 변환
		String day3 = "19941122"; //SimpleDateFormat 생성자에 전달되는 형시고가 일치해야함
		java.util.Date utildate = new java.text.SimpleDateFormat("yyyyMMdd").parse(day3);
		
		// java.util.Date -> java.sql.Date 변환
		java.util.Date ud = new java.util.Date();
		java.sql.Date sd = new java.sql.Date(ud.getTime());
		
		System.out.println(sqldate);
		System.out.println(sqltimestamp);
		System.out.println(utildate);
		System.out.println(ud);
		System.out.println(sd);
	}
}
