import java.io.File;
import java.io.IOException;


/**
 * genère 100 fichiers pour les tests
 */

public class CreationExemple {
	
	public CreationExemple(){
	String[] tab = new String[]{"mp3","wav","aac","avi","mp4","mpg","c","java"};
	int cpt = 0;
	for(int i = 0; i<100; i++){
		String ext = tab[cpt];
		File f = new File("/home/infoetu/cottona/test/fichier" + i+"."+ext);
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(cpt >= tab.length-1){
			cpt=0;
		}
		else{
			cpt++;
		}
	}
	System.out.println("generation terminée");
	}
	
	public static void main(String[] args){
		new CreationExemple();
	}
	
}
