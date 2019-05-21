package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextFileReader {

	public static ArrayList<String> textFileReader(String textFilePath) {
		ArrayList<String> textList = new ArrayList<String>();

		if (BasicOperation.fileExists(textFilePath)) {
			try {
				// BufferedReaderクラスのreadLineメソッドを使って1行ずつ読み込み表示する
				FileReader fileReader = new FileReader(textFilePath);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				String data;
				while ((data = bufferedReader.readLine()) != null) {
					textList.add(data);
				}

				// 最後にファイルを閉じてリソースを開放する
				bufferedReader.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return textList;

	}

}
