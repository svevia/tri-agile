	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.ArrayList;
	import java.util.List;

public class TriParExtension {

		
		public TriParExtension(String chemin, String s, boolean b){
			if(!b){
			File dossier = new File(chemin);
			if(dossier.exists()&& dossier.isDirectory()){
				File[] ListeFichier= dossier.listFiles(); 
				List<String> extconnue = new ArrayList<String>();
						
				for(File f:ListeFichier){
					System.out.println(f.getParent());
					if(extconnue.contains(FileManipulation.getExtension(f))){
						try {
							new deplacer(f.getAbsolutePath(), f.getParent() + "/" + FileManipulation.getExtension(f)+ "/" + f.getName());
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
						else {
							extconnue.add(Type.getType(f.getAbsolutePath()));
							CreerDossier.Creer(chemin + "/" + FileManipulation.getExtension(f));
							try {
								new deplacer(f.getAbsolutePath(), f.getParent() + "/" + FileManipulation.getExtension(f)+ "/" + f.getName());
							} catch (FileNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						
					}
				}
			} else {
				File dossier = new File(chemin);
				if(dossier.exists()&& dossier.isDirectory()){
					File[] ListeFichier= dossier.listFiles(); 
					List<String> extconnue = new ArrayList<String>();
							
					for(File f:ListeFichier){
						System.out.println(f.getParent());
						if(s.equals(FileManipulation.getExtension(f))){
							new Delete(f);
						}
						
							
						}
					}
			}
		}
			
			
			
			
		
	public static void main(String[] args){
		new TriParExtension("/home/infoetu/cottona/test", "mp3", true);
	}
	}

