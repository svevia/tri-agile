import java.io.File;

public class Lister {
	
	Afficher folder = new Afficher();
	
	public void ListerExt(File file){
		
	 if(!file.exists()){
			System.out.println("Le fichier " + file.getName() + " n'existe pas");		
	}
	 else if(!file.isDirectory()){
			System.out.println("Le fichier " + file.getName()+ " n'est pas un dossier");
		}
		
		else {
			File[] listefile=file.listFiles();	
			System.out.println("Le dossier "+ file.getName() + " contient : ");
			for(int i=0; i<listefile.length;i++){
				folder.AfficherExtension(listefile[i]);
			}
		}
		
	}	
	
	public void ListerType(File file){
		
		 if(!file.exists()){
				System.out.println("Le fichier " + file.getName() + " n'existe pas");		
		}
		 else if(!file.isDirectory()){
				System.out.println("Le fichier " + file.getName()+ " n'est pas un dossier");
			}
			
			else {
				File[] listefile=file.listFiles();	
				System.out.println("Le dossier "+ file.getName() + " contient : ");
				for(int i=0; i<listefile.length;i++){
					folder.AfficherType(listefile[i]);
				}
			}
			
		}	
	
}
