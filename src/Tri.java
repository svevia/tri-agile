import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Tri {

	public void TriParNom(File file, int nombre) {
		
		//String[] mots = new String[file.listFiles().length];
		ArrayList<String> list = new ArrayList<String>();
		
		if(!file.exists()) {
			
		}
		else if(!file.isDirectory()) {
				
		}
		else {
			for(int i = 0; i < file.listFiles().length; i ++) {
				list = new ArrayList<String>();
				for(int j = (i+1); j < file.listFiles().length; j ++) {
					
					if(file.listFiles()[i].getName().substring(0, nombre).equals(file.listFiles()[j].getName().substring(0, nombre))) {
						if(list.isEmpty()) {
							list.add(file.listFiles()[i].getName());
						}
						file.listFiles()[j].getName();
					}
					
					/*if(file.listFiles()[i].getName().substring(0, nombre).equals(file.listFiles()[j].getName().substring(0, nombre)) 
							&& !file.listFiles()[i].getName().substring(0, nombre).equals(mots[0])) {
						CreerDossier.Creer(file.getAbsolutePath() + "/Tri-" + file.listFiles()[i].getName().substring(0, nombre));
						deplacer d = new deplacer(file.listFiles()[i].getAbsolutePath(), file.getAbsolutePath() + "/Tri-" + file.listFiles()[i].getName().substring(0, nombre));
						mots[0] = file.listFiles()[i].getName().substring(0, nombre);
					}*/
				}
				afficherListe(list);
			}
		}
		System.out.println("");
		afficherDossier(file);
	}
	
	public void afficherListe(ArrayList<String> list) {
		for(int i = 0; i < list.size(); i ++) {
			System.out.print(list.get(i) + " | ");
		}
	}
	
	public void afficherDossier(File file) {
		for(int i = 0; i < file.listFiles().length; i ++) {
			System.out.print(file.listFiles()[i].getName() + " | ");
		}
	}
}
