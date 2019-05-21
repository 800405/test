package test;

import time.ForCalendar;

public class Main {

	public static void main(String[] args) {

		time.ForCalendar forCalendar = new ForCalendar();
		String nowTime =forCalendar.getNowTimeForCalender();
		System.out.println(nowTime);
	}

}
