import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Fenetre extends JFrame {

	private PanelSelectionDossier selec;
	private PanelChoixModeTri tri;
	private PanelChoixType type;
	private PanelBouton lancez;
	
	public Fenetre() {
		super("Tri-Agile");
		selec = new PanelSelectionDossier(this);
		tri = new PanelChoixModeTri(this);
		type = new PanelChoixType(this);
		lancez = new PanelBouton(this);
		
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setSize(new Dimension(500,600));
		
		add(selec);
		add(tri);
		add(type);
		add(lancez);
		
		type.setVisible(false);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	

	public PanelChoixModeTri getPanelChoixTri() {
		return tri;
	}
	
	public PanelChoixType getPanelChoixType() {
		return type;
	}
	
	public PanelSelectionDossier getPanelSelecDossier() {
		return selec;
	}
	
	public static void main(String[] args) {
		new Fenetre();
	}
	
}
