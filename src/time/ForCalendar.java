package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ForCalendar {

	public String getNowTimeForCalender() {
		return getNowTimeForCalender("yyyy-MM-dd");
	}

	public String getNowTimeForCalender(String format) {
		Calendar calendar = Calendar.getInstance();
		// SimpleDateFormatクラスでフォーマットパターンを設定する
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String nowTime = sdf.format(calendar.getTime());
		return nowTime;
	}

}
