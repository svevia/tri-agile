import java.io.File;

public class FileManipulation {

	Type type = new Type("test");
	
	static public String getExtension(File file) {
			String name = file.getName();
			String res = "";
			for(int i = name.length() - 1; i >= 0; i--) {
				if(name.charAt(i) == '.') {
					res = name.substring(i+1);
				}
			}
			System.out.println("Le fichier " + name + " qui a pour extension \"" + res + "\".");
			return res;
	}
	
	
	static public String getNom(File file) {
		String name = file.getName();
		String res = "";
		for(int i = name.length() - 1; i >= 0; i--) {
			if(name.charAt(i) == '.') {
				res = name.substring(0,i);
			}
		}
		System.out.println("Le fichier " + name + " qui a pour nom \"" + res + "\".");
		return res;
	}
	
	
	static public String getType(File file) {
		final String name = file.getName();
		System.out.println(name);
		String ext = "";
		String res = Type.getType(file.getAbsolutePath());
		System.out.println("Le fichier " + name + " qui a pour type \"" + res + "\".");
		return res;
	}
}
