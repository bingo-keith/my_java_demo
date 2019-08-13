package chilly.java.lessons.demo.instance.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSimpleDateFormat {

	public static void main(String[] args) {
		Date date = new Date();
		String strDateFormat = "yyyy-MM-dd HH:mm:ss a";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
		System.out.println("现在时间为：" + sdf.format(date));
	}

}
