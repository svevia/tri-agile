import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TriParNom {

	/**
	 * Tri les fichiers contenant le mot passer en paramètre dans le dossier cible
	 * @param file
	 * @param text
	 * @param b
	 */
	public TriParNom(File file, String text, boolean b) {
		for(File file2 : file.listFiles()) {
			if(file2.getName().indexOf(text) == 0) {
				if(!b){
				CreerDossier.Creer(file.getAbsolutePath() + "/" + text);
				}
				try {
					if(b){
						new Delete(file2);
					} else {
						new deplacer(file2.getAbsolutePath(), file.getAbsolutePath() + "/" + text + "/" + file2.getName());
					}
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[]args){
		new TriParNom(new File("/home/infoetu/cottona/test"), "fichier", true);
	}
}

