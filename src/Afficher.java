import java.io.File;

public class Afficher {

	Type type = new Type();
	
	public void AfficherExtension(File file) {
		String name = file.getName();
		String res = "";
		for(int i = name.length() - 1; i >= 0; i--) {
			if(name.charAt(i) == '.') {
				res = name.substring(i+1);
			}
		}
		System.out.println("Le fichier " + name + " qui a pour extension \"" + res + "\".");
	}
	
	public void AfficherType(File file) {
		String name = file.getName();
		String ext = "";
		for(int i = name.length() - 1; i >= 0; i--) {
			if(name.charAt(i) == '.') {
				ext = name.substring(i+1);
			}
		}
		String res = type.getType(ext);
		System.out.println("Le fichier " + name + " qui a pour type \"" + res + "\".");
	}
}
