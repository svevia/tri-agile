import java.io.File;

public class Lister {
	
	FileManipulation folder = new FileManipulation();
	
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
				folder.getExtension(listefile[i]);
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
					folder.getType(listefile[i]);
				}
			}
			
		}	
	
}
