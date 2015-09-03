import java.io.File;


public class CreerDossier {
	public static void Creer(String chemin){
		
		String dossier;
		File f = new File(chemin);
		
			for(int i = chemin.length()-1 ; i >= 0 ; i--){
				String c = "" + chemin.charAt(i);
				if(c.equals("/")){
					dossier = chemin.substring(0, i);
					System.out.println(dossier);
					File d = new File(dossier);
					if(!d.exists()){
						System.out.println("le chemin n'est pas correct");
					}
					else{
						f.mkdir(); 
						System.out.println("dossier cree");
					}
					break;
				}

			}

		}
		
	}

