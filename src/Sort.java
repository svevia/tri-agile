import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;



public class Sort {
	
	public Map<String, Long>  SortByDate(File folder){
		File[] fichiers = folder.listFiles();
		
		/*Arrays.sort(fichiers, new Comparator<File>() {
			@Override
			public int compare(File o1, File o2) {				
				return (int) (o1.lastModified() - o2.lastModified());
			}
		});*/
		
		
		Map<String,Long> table = new HashMap<String,Long>();
		
		for(File fichier: fichiers){
			table.put(fichier.getName(), fichier.lastModified());
		}
		table = trier(table);
		return table;
	}
	
	public Map<String,Long> trier(Map<String,Long> table){
		Long min = table.get("all_of_me.mp3");
		//System.out.println(min);
		Map<String,Long> newTable = new HashMap<String,Long>();
		String cle = "";
		int i = table.size();
		while(i>0){
			for(Long value: table.values()){
				//System.out.println(value);
				if( (int) (long) value < (int) (long) min){
					min = value;
				}
			}
			
			System.out.println(min);
			
			for(String key : table.keySet()){
				if(table.get(key)== min){
					cle = key;
				}
			}
			newTable.put(cle, min);
			//System.out.println("la clé     " + cle);
			table.remove(cle);
			i--;
			
		}
		
		return newTable;
	}
	
	public List<File> filter(List<File> fichiers, Filtre filtre) {
		for (File f : fichiers)
		 if(filtre.accept(f))
			   
	}
	
	public static void main(String[] args){
		/*Sort sort = new Sort();
		File folder = new File("/home/infoetu/khalids/folder");
		Map<String,Long> table = new HashMap<String,Long>();
		table = sort.SortByDate(folder);
		//table.remove("fc-barcelona-hd-wallpaper1.jpg");
		/*for(String value: table.keySet()){
			System.out.println(value);
		}*/
		//System.out.println(table.get("all_of_me.mp3"));
		
		/*Map<String,Long> table = sort.SortByDate(folder);
		for(String value: table.keySet()){
			System.out.println(value);
		}*/
		
		
			/*	for(String key: table.keySet()){
				System.out.println(key);
			}*/
	
		File[] fichiers = new File("/home/infoetu/khalids/folder").listFiles();
		
		
		
		Arrays.sort(fichiers, new Comparator<File>() {
			@Override
			public int compare(File o1, File o2) {
				if (o1.lastModified() < o2.lastModified())
					return -1;
				if (o1.lastModified() > o2.lastModified())
					return 1;
				return 0;
			}
		});
		for (File f : fichiers) {
			System.out.println(f.getName()+"\t\t \t\t-> "+f.lastModified());
		}
	}
}
