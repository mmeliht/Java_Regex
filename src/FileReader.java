
/**
*
* @another Mustafa Melih Tüfekcioðlu mustafa.tufekcioglu@ogr.sakarya.edu.tr
* @since 29.03.2022
* <p>
* 2.Öðretim b grubu
* </p>
*/
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
	public String filePath;
	public String line;
	public String str = "";

	public FileReader() {
		filePath = "dist/" + "Deneme.java";
		try {
			File myObj = new File(filePath);
			Scanner myReader = new Scanner(myObj);

			while (myReader.hasNextLine()) {
				line = myReader.nextLine();
				str += line + "\n";
			}
			myReader.close();

		}

		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
