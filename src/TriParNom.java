import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TriParNom {

	public void Tri(File file, String text) {
		for(File file2 : file.listFiles()) {
			if(file2.getName().indexOf(text) == 0) {
				CreerDossier.Creer(file.getAbsolutePath() + "/" + text);
				try {
					new deplacer(file2.getAbsolutePath(), file.getAbsolutePath() + "/" + text + "/" + file2.getName());
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
