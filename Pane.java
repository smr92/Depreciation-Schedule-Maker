package depreciation;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pane extends JPanel  {

	JOptionPane jp = new JOptionPane();
		
	JTextField assetDescription = new JTextField(10);
	JTextField assetUsefulLife = new JTextField(10);
	JTextField assetCost = new JTextField(10);
	
	JLabel descriptionLabel = new JLabel("Asset Description");
	JLabel lifeLabel = new JLabel ("Useful Life");
	JLabel costLabel = new JLabel ("Asset Cost");
	
	Asset asset = new Asset();
	
	CalculateButton cb = new CalculateButton(assetDescription, assetUsefulLife, assetCost, asset);
	
	GridBagLayout gb = new GridBagLayout();
	GridBagConstraints gc = new GridBagConstraints();
	

	
	Pane() {
		
		setLayout(gb);
		
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = .5;
		add(descriptionLabel,gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.weightx = .5;
		add(lifeLabel,gc);
		
		gc.gridx = 2;
		gc.gridy = 0;
		gc.weightx = .5;
		add(costLabel,gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.weightx = .5;
		add(assetDescription,gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		gc.weightx = .5;
		add(assetUsefulLife,gc);
		
		gc.gridx = 2;
		gc.gridy = 1;
		gc.weightx = .5;
		add(assetCost,gc);
		
		gc.gridx = 1;
		gc.gridy = 2;
		gc.weightx = .5;
		gc.weighty = .5;
		add(cb,gc);
				
	}

}
