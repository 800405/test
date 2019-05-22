package file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BasicOperation {

	public static void copyFile(String sorcePathString,String destinatuPathString) {
		Path sorcePath =Paths.get(sorcePathString);
		Path destinatuPath=Paths.get(destinatuPathString);

		try {
			Files.copy(sorcePath, destinatuPath);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	public static boolean fileExists(String filePath) {

		File file = new File(filePath);

		if (!file.exists()) {
			System.out.println("ファイルが存在しない");
			return false;
		}
		return true;
	}
}
