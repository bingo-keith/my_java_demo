package chilly.java.lessons.demo.instance.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimestampConvert {
	public static void main(String[] args) {
		Long timeStamp = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
		System.out.println("格式化结果：" + sd);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
		String sd2 = sdf2.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
		System.out.println("格式化结果：" + sd2);
	}
}
