import java.io.File;


public class Delete {
	public Delete(File source){
		
		if(!source.exists()){
			System.out.println("fichier n'existe pas");
		}
		else{
			source.deleteOnExit();
			System.out.println("suppression ok");
		}
	}
	public static void main(String[]args){
		File f = new File("/home/infoetu/cottona/minicom.log");
		new Delete(f);
	}
}
