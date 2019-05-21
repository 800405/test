package test;

import java.util.ArrayList;
import java.util.Collections;

import file.TextFileReader;
import file.TextFileWriter;
import time.ForCalendar;

public class Main {

	public static void main(String[] args) {

		String textFilePath = "";
		String nowTime = ForCalendar.getNowTimeForCalender();

		TextFileWriter.textFileWriter(textFilePath, nowTime, true);
		ArrayList<String> textList = TextFileReader.textFileReader(textFilePath);


		if (textList.size() > 3) {

			/*
			 * String date= textList.get(0); time.CalculateTime.minutesDiff(date, nowTime);
			 */
			Collections.sort(textList, Collections.reverseOrder());

			int i = 0;
			while (i <= 2) {
				if (i == 0) {
					TextFileWriter.textFileWriter(textFilePath, textList.get(i), false);
				} else {
					TextFileWriter.textFileWriter(textFilePath, textList.get(i), true);
				}
				i++;
			}
		}

		textList = TextFileReader.textFileReader(textFilePath);
		for (int i = 0; i < textList.size(); i++) {

			System.out.println(textList.get(i));
		}

	}

}
