import java.io.File;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		AfficherExt ae = new AfficherExt();
		File file1 = new File("Music.mp3");
		File file2 = new File("Video.mp4");
		File file3 = new File("Code.c");
		ae.AfficherExtension(file1);
		ae.AfficherExtension(file2);
		ae.AfficherExtension(file3);
		if(!file1.exists()) {
			System.out.println("gdruidgh"); 
		}*/
		
		File folder = new File("Tes");
		File folder2 = new File("PasDossier.txt");
		File folder3 = new File("Test");
		Lister liste = new Lister();
		liste.ListerExt(folder);
		System.out.println("-------------------------------------------------");
		liste.ListerExt(folder2);
		System.out.println("-------------------------------------------------");
		liste.ListerExt(folder3);
		System.out.println("-------------------------------------------------");
		liste.ListerType(folder3);
		
		
		
	}

}
