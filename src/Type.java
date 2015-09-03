import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


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
	
	public static int afficherListeExtensions(String nom){
		
		File f = new File("lib/types/" + nom + ".txt");
		InputStream flux;
		int i = 1;
		try {
			flux = new FileInputStream(f);
			InputStreamReader lecture=new InputStreamReader(flux);
			BufferedReader buff=new BufferedReader(lecture);
			String ligne = buff.readLine();
			while (ligne!=null){
				System.out.println(i + ". " + ligne);
				ligne = buff.readLine();
				i++;
			}
			flux.close();
			buff.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return i-1;
	}
	
	
	public static void supprimerExtsension(String nom){
		int nbrExtensions = afficherListeExtensions(nom);
		System.out.println((nbrExtensions+1)+". ajouter une extension");
		Scanner in = new Scanner(System.in);
		boolean nbr = false;
		String choix;
		int value = -1;
		//récupération du choix de l'utilisateur
		while(!nbr){
			System.out.println("Choisissez l'extension à supprimer");
			choix = in.next();
			try{
				value =Integer.parseInt(choix);
				if(value > 0 && value <= nbrExtensions + 1){
				nbr = true;
				}
			}
			catch(NumberFormatException e){
				e.printStackTrace();
			}
		}
		
		//création d'un fichier temporaire
		if(value > 0 && value <= nbrExtensions){
			File ancien = new File("lib/types/" + nom + ".txt");
			ancien.renameTo(new File("lib/types/temp"));
			File nouveau = new File("lib/types/" + nom + ".txt");
			try {
				nouveau.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			//transfert des données de l'ancien fichier vers le nouveau en supprimant la valuer voulue
			InputStream flux;
			int i = 1;
			try {
				flux = new FileInputStream(new File("lib/types/temp"));
				InputStreamReader lecture=new InputStreamReader(flux);
				BufferedReader buff=new BufferedReader(lecture);
				String ligne = buff.readLine();
				while (ligne!=null){
					if(i != value){
						ajouterExtension(nom, ligne);
					}
					ligne = buff.readLine();
					i++;
				}
				buff.close();
				flux.close();
				new File("lib/types/temp").delete();
				
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		
		else if(value == nbrExtensions +1){
			System.out.println("ajouter une extension dans " + nom);
			Scanner sc = new Scanner(System.in);
			String nouvelleExtension = sc.next();
			ajouterExtension(nom, nouvelleExtension);
		}
		
		
	}
	
	
	public static void main(String[] args){
		String[] images = new String[]{"jpg","png"};
		Type Ext = new Type("image", images);
		System.out.println("type crée");
		supprimerExtsension("image");
		afficherListeExtensions("image");
		
	}
}




