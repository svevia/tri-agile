import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("chemin source de triage :");
		String chemin = sc.next();
		System.out.println("Choisissez votre type de tri :");
		System.out.println("1.Tri par date");
		System.out.println("2.Tri par nom");
		System.out.println("3.Tri par type");
		System.out.println("4.Tri par extension");
		String choix = sc.next();
		
		if(choix == "1"){
			
			
		
		if(choix == "2"){
			File[] tab = Type.listType();
			int i = 1;
			for(File f : tab){
				System.out.println(f.getPath().length()-3);
				System.out.println(i + ". " + f.getPath().substring(0,f.getPath().length()-3));
				
			}
		/*if(choix == "3"){
			
		}*/
			
		}
		
		
		}
	}
		
	}

