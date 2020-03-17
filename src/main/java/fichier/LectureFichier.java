package fichier;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/temp/recensement population 2016.csv");
		List<String> lignes = FileUtils.readLines(file, "UTF-8");
		for (int i = 0; i < lignes.size(); i++)
			
		{
			System.out.println(lignes.get(i));
		}

	}
}
