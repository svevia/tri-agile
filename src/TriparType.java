import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class TriparType {
	
	public TriparType(String chemin, String text, boolean b){
		
		if(!b){
		File dossier = new File(chemin);
		if(dossier.exists()&& dossier.isDirectory()){
			File[] ListeFichier= dossier.listFiles(); 
			List<String> typeconnue = new ArrayList<String>();
					
			for(File f:ListeFichier){
				if(typeconnue.contains(Type.getType(f.getAbsolutePath()))){
						try {
							
							new deplacer(f.getAbsolutePath(), f.getParent() + "/" + Type.getType(f.getAbsolutePath())+ "/" + f.getName());
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
						else {
							if(Type.getType(f.getAbsolutePath()) != null){
								typeconnue.add(Type.getType(f.getAbsolutePath()));
								CreerDossier.Creer(chemin + "/" + Type.getType(f.getAbsolutePath()));
								try {
									new deplacer(f.getAbsolutePath(), f.getParent() + "/" + Type.getType(f.getAbsolutePath())+ "/" + f.getName());
								} catch (FileNotFoundException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
			}
			}
		} else {
			File dossier = new File(chemin);
			if(dossier.exists()&& dossier.isDirectory()){
				File[] ListeFichier= dossier.listFiles(); 
						
				for(File f:ListeFichier){
					if(FileManipulation.getType(f).equals(text)){
							new Delete(f);
					}	
					}
				}
		}
	}
		
		
		
		
	
public static void main(String[] args){
	new TriparType("/home/infoetu/cottona/test", "musique", true);
}
}