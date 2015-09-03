import java.io.File;

public class AfficherExt {

	public void AfficherExtension(File file) {
		String name = file.getName();
		String res = "";
		for(int i = name.length() - 1; i >= 0; i--) {
			if(name.charAt(i) == '.') {
				res = name.substring(i+1);
			}
		}
		System.out.println("Le fichier " + name + " a pour extension \"" + res + "\".");
	}
}
