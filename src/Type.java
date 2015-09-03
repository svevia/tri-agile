import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



public class Type {
	
	public Type(String nom){
		File t = new File("lib/types/" + nom + ".txt");
		if(t.exists()){
			t.delete();
		}
		try {
			t.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public Type(String nom,String[] ext){
		this(nom);
		for(String ligne : ext){
			ajouterExtension(nom, ligne);
		}
	}
	
	public static String getType(String file){
		
		String extension = Afficher.AfficherExtension(new File(file));
		
		File fichiersTypes = new File("lib/types");
		File[] listefile=fichiersTypes.listFiles();	
		
		for(File f : listefile){
			try{
				InputStream flux=new FileInputStream(f); 
				InputStreamReader lecture=new InputStreamReader(flux);
				BufferedReader buff=new BufferedReader(lecture);
				String ligne = buff.readLine();
				while (ligne!=null){
					if(extension.equals(ligne)){
						return Afficher.AfficherNom(f);
					}
					ligne = buff.readLine();
				}
				buff.close(); 
				}		
				catch (Exception e){
				System.out.println(e.toString());
				}
		}
		

		return null;
		
	}
	
	public static void ajouterExtension(String type, String ext){
		File t = new File("lib/types/" + type + ".txt");
		FileWriter fw = null;
		 try {
			fw = new FileWriter (t,/*append=*/true);
			fw.write(ext);
			fw.write("\n");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void afficherListeExtensions(String nom){
		
		File f = new File("lib/types/" + nom + ".txt");
		InputStream flux;
		try {
			flux = new FileInputStream(f);
			InputStreamReader lecture=new InputStreamReader(flux);
			BufferedReader buff=new BufferedReader(lecture);
			String ligne = buff.readLine();
			int i = 1;
			while (ligne!=null){
				System.out.println(i + ". " + ligne);
				ligne = buff.readLine();
				i++;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	public static void supprimerExtsension(String nom){
		afficherListeExtensions(nom);
	}
	
	
	public static void main(String[] args){
		String[] images = new String[]{"jpg","png"};
		Type Ext = new Type("image", images);
		System.out.println("type crée");
		afficherListeExtensions("image");
	}
}




