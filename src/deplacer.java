import java.io.File;
import java.io.FileNotFoundException;


public class deplacer {
	public deplacer(String src, String dest) throws FileNotFoundException{
		File source = null;
		File destination = null;
		source = new File(src);
		destination = new File(dest);
		source.renameTo(destination);
		System.out.println("deplacement ok");
	}

}
