

public class Type {
	
	public String getType(String file){
		switch(file){
			case "mp4":
			case "avi":
			case "mpg":
				return "video";
			case "mp3":
			case "wav":
			case "aac":
				return "music";
			case "txt":
				return "texte";
			case "c":
				return "code";
		}
		return null;
		
	}
	/*public static void main(String[] args){
		Type Ext = new Type();
		String type = Ext.getType("mp4");
		System.out.println(type);
	}*/
}




