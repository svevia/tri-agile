import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class PanelChoixModeTri extends JPanel {
	
	private Border border;
	private TitledBorder title;
	private ButtonGroup group;
	/*private JRadioButton nom;
	private JRadioButton ext;
	private JRadioButton type;
	private JRadioButton date;*/
	private JTextArea area;
	private Fenetre f;
	private JRadioButton[] groups;
	
	public PanelChoixModeTri(Fenetre f) {
		this.f = f;
		border = BorderFactory.createLineBorder(Color.black);
		title = BorderFactory.createTitledBorder(border, "Choisissez le mode de tri :");
		group = new ButtonGroup();
		groups = new JRadioButton[]{new JRadioButton("Nom"), new JRadioButton("Extension"), new JRadioButton("Type"), new JRadioButton("Date")};
		/*nom = new JRadioButton("Nom");
		ext = new JRadioButton("Extension");
		type = new JRadioButton("Type");
		date = new JRadioButton("Date");*/
		area = new JTextArea();
		area.setBorder(border);
		
		for(int i = 0; i < groups.length; i ++) {
			group.add(groups[i]);
		}
		/*group.add(nom);
		group.add(ext);
		group.add(type);
		group.add(date);*/
		
		this.setBorder(title);
		setLayout(new GridLayout(4,2));
		add(groups[0]);
		add(area);
		add(groups[1]);
		add(new JLabel(""));
		add(groups[2]);
		add(new JLabel(""));
		add(groups[3]);
	}
	
	public JTextArea getArea() {
		return area;
	}
	
	public JRadioButton[] getGroup() {
		return groups;
	}
	
	public ButtonGroup getButtonGroup() {
		return group;
	}
}
