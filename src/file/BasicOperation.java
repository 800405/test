package file;

import java.io.File;

public class BasicOperation {

	public static boolean fileExists(String filePath) {

		File file = new File(filePath);

		if (!file.exists()) {
			System.out.println("ファイルが存在しない");
			return false;
		}
		return true;
	}
}
