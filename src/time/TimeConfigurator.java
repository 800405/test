package time;

public class TimeConfigurator {
	private static String dataFormat = "yyyy-MM-dd_HH;mm;ss";

	public static String getDataFormat() {
		return dataFormat;
	}

	public static void setDataFormat(String dataFormat) {
		TimeConfigurator.dataFormat = dataFormat;
	}

}
