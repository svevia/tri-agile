import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelBouton extends JPanel implements ActionListener{

	private Fenetre f;
	private JButton bouton;
	
	public PanelBouton(Fenetre f) {
		this.f = f;
		bouton = new JButton("Lancez");
		bouton.addActionListener(this);
		setLayout(new BorderLayout());
		add(new JLabel("                                 "), BorderLayout.WEST);
		add(bouton, BorderLayout.CENTER);
		add(new JLabel("                                 "), BorderLayout.EAST);
		add(new JLabel("                "), BorderLayout.NORTH);
		add(new JLabel("                "), BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String folder = f.getPanelSelecDossier().getChooser().getSelectedFile().getName();
		System.out.println("Vous avez selectionné le dossier : " + folder);
		
		String choixNom;
		for(JRadioButton bouton : f.getPanelChoixTri().getGroup()) {
			if(bouton.isSelected()) {
				System.out.println("Vous avez choisis le mode de tri : " + bouton.getText());
				if(bouton.getText().equals("Nom")) {
					choixNom = f.getPanelChoixTri().getArea().getText();
					System.out.println("Avec pour mot : " + choixNom);
				}
			}
		}
		
	}
	
}
