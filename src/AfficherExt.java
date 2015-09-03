import java.io.File;

public class AfficherExt {

	public void AfficherExtension(File file) {
		String name = file.getName();
		String res = "";
		for(int i = name.length() - 1; i >= 0; i--) {
			if(name.charAt(i) == '.') {
				res = name.substring(i);
				// i + 1 pour retirer le point
			}
		}
		System.out.println("Le fichier " + name + " a pour extension \"" + res + "\".");
	}
}
