import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelSelectionDossier extends JPanel implements ActionListener {
	
	private Fenetre f;
	private JLabel label;
	private JFileChooser chooser; 
	
	public PanelSelectionDossier(Fenetre f) {
		this.f = f;
		setLayout(new BorderLayout());
		label = new JLabel("Selectionner votre dossier :");
		chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		add(label, BorderLayout.NORTH);
		add(chooser, BorderLayout.CENTER);
		
		chooser.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Dossier ou fichier sélectionné");
	}
	
	public JFileChooser getChooser() {
		return chooser;
	}
	
}
