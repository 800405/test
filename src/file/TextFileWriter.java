package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileWriter {

	public static void textFileWriter(String textFilePath, String text,boolean appending) {
		try {
			// FileWriterクラスのオブジェクトを生成する
			FileWriter file = new FileWriter(textFilePath, appending);
			// PrintWriterクラスのオブジェクトを生成する
			PrintWriter pw = new PrintWriter(new BufferedWriter(file));

			// ファイルに書き込む
			pw.println(text);

			// ファイルを閉じる
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
