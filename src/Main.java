import java.io.File;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AfficherExt ae = new AfficherExt();
		File file1 = new File("Music.mp3");
		File file2 = new File("Video.mp4");
		File file3 = new File("Code.c");
		ae.AfficherExtension(file1);
		ae.AfficherExtension(file2);
		ae.AfficherExtension(file3);
	}

}
