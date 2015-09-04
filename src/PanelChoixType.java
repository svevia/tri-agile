import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class PanelChoixType extends JPanel {
	
	private Border border;
	private TitledBorder title;
	private JComboBox listeType;
	private JComboBox listeExt;
	private JTextArea area;
	private JButton ajout;
	private JButton supr;
	private JList list;
	private Fenetre f;
	
	public PanelChoixType(Fenetre f) {
		this.f = f;
		String[] types = new String[]{"Musique", "Video", "Documents Texte", "Images", "Gestion", "Cours"};
		border = BorderFactory.createLineBorder(Color.black);
		title = BorderFactory.createTitledBorder(border, "Gestion des types");
		listeType = new JComboBox(types);
		area = new JTextArea(2,8);
		area.setBorder(border);
		ajout = new JButton("Ajouter");
		supr = new JButton("Supprimer");
		String[] ext = new String[]{"mp3", "wav", "machin"};
		list = new JList(ext);
		setLayout(new FlowLayout());
		
		add(listeType);
		add(list);
		add(supr);
		add(area);
		add(ajout);
		
		
		this.setBorder(title);
	}
	
}
