import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.filechooser.FileSystemView;

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
		JOptionPane jop1 = new JOptionPane();
		System.out.println("Vous avez selectionné le dossier : " + folder);
		
		String choixNom;
		for(JRadioButton bouton : f.getPanelChoixTri().getGroup()) {
			if(bouton.isSelected()) {
				System.out.println("Vous avez choisis le mode de tri : " + bouton.getText());
				if(bouton.getText().equals("Nom")) {
					choixNom = f.getPanelChoixTri().getArea().getText();
					
					if(f.getPanelChoixTri().getBox().isSelected()) {
						System.out.println("Supprimer ");
						if(choixNom.equals("")) {
							
							jop1.showMessageDialog(null, "Champ vide pour suppression par nom", "Attention", JOptionPane.ERROR_MESSAGE);
						}else {
							int choix = jop1.showConfirmDialog(null, "Voulez-vous vraiment supprimer les fichiers ?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
							
							if(choix == JOptionPane.OK_OPTION) {
								new TriParNom(new File(f.getPanelSelecDossier().getChooser().getSelectedFile().getAbsolutePath()), choixNom, true);
							
							JFrame frame = new JFrame();
								frame.setSize(new Dimension(500,500));
								frame.setContentPane(new JFileChooser(new File(f.getPanelSelecDossier().getChooser().getSelectedFile().getAbsolutePath())));
								frame.setVisible(true);
							}
						}
					
					}
					else {
						
						if(choixNom.equals("")) {
							
							jop1.showMessageDialog(null, "Champ vide pour tri par nom", "Attention", JOptionPane.ERROR_MESSAGE);
						}
						else {
							System.out.println("Avec pour mot : " + choixNom);
							new TriParNom(new File(f.getPanelSelecDossier().getChooser().getSelectedFile().getAbsolutePath()), choixNom, false);
							JFrame frame = new JFrame();
							frame.setSize(new Dimension(500,500));
							frame.setContentPane(new JFileChooser(new File(f.getPanelSelecDossier().getChooser().getSelectedFile().getAbsolutePath())));
							frame.setVisible(true);
						}
					}
				}
				
				
				
				
				
				
				
				else if(bouton.getText().equals("Extension")) {
					choixNom = f.getPanelChoixTri().getArea().getText();
					if(f.getPanelChoixTri().getBox().isSelected()) {
						System.out.println("Supprimer ");
						if(choixNom.equals("")) {
							
							jop1.showMessageDialog(null, "Champ vide pour suppression par extension", "Attention", JOptionPane.ERROR_MESSAGE);
						}else {
							int choix = jop1.showConfirmDialog(null, "Voulez-vous vraiment supprimer les fichiers ?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
							
							if(choix == JOptionPane.OK_OPTION) {
								new TriParExtension(f.getPanelSelecDossier().getChooser().getSelectedFile().getAbsolutePath(), choixNom, true);
							
							JFrame frame = new JFrame();
								frame.setSize(new Dimension(500,500));
								frame.setContentPane(new JFileChooser(new File(f.getPanelSelecDossier().getChooser().getSelectedFile().getAbsolutePath())));
								frame.setVisible(true);
							}
						}}
						else {
					
					
					new TriParExtension(f.getPanelSelecDossier().getChooser().getSelectedFile().getAbsolutePath(), new String(""), false);
					JFrame frame = new JFrame();
					frame.setSize(new Dimension(500,500));
					frame.setContentPane(new JFileChooser(new File(f.getPanelSelecDossier().getChooser().getSelectedFile().getAbsolutePath())));
					frame.setVisible(true);
						}
				}
				
				
				
				
				
				
				
				
				
				else if(bouton.getText().equals("Type")) {
					choixNom = f.getPanelChoixTri().getArea().getText();
					if(f.getPanelChoixTri().getBox().isSelected()) {
						System.out.println("Supprimer ");
						if(choixNom.equals("")) {
							
							jop1.showMessageDialog(null, "Champ vide pour suppression par type", "Attention", JOptionPane.ERROR_MESSAGE);
						}else {
							int choix = jop1.showConfirmDialog(null, "Voulez-vous vraiment supprimer les fichiers ?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
							
							if(choix == JOptionPane.OK_OPTION) {
								new TriparType(f.getPanelSelecDossier().getChooser().getSelectedFile().getAbsolutePath(), choixNom, true);
							
							JFrame frame = new JFrame();
								frame.setSize(new Dimension(500,500));
								frame.setContentPane(new JFileChooser(new File(f.getPanelSelecDossier().getChooser().getSelectedFile().getAbsolutePath())));
								frame.setVisible(true);
							}
						}}
						else {
					new TriparType(f.getPanelSelecDossier().getChooser().getSelectedFile().getAbsolutePath(), new String(""), false);
					JFrame frame = new JFrame();
					frame.setSize(new Dimension(500,500));
					frame.setContentPane(new JFileChooser(new File(f.getPanelSelecDossier().getChooser().getSelectedFile().getAbsolutePath())));
					frame.setVisible(true);
				}}
				
				
				
				
				
				/*else if(bouton.getText().equals("Date")) {
					new Sort(new File(f.getPanelSelecDossier().getChooser().getSelectedFile().getAbsolutePath()));
				}*/
						
			}
		}
		
	}
	
}
