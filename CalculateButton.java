package depreciation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculateButton extends JButton implements ActionListener {
	
	JTextField descrip;
	JTextField life;
	JTextField cost;
	
	Asset asset;
	
	JOptionPane jp = new JOptionPane();
	
	CalculateButton(JTextField descrip, JTextField life, JTextField cost, Asset asset) {
		
		this.descrip = descrip;
		this.life = life;
		this.cost = cost;
		this.asset = asset;
		
		setText("Calculate");
		
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			if(this.descrip!= null) {
				
				asset.setAssetType(descrip);
				System.out.println(asset.assetType);
			}
			
			if(this.life!= null) {
				
				asset.setUsefulLife(life);
				System.out.println(asset.usefulLife);
			}
			
			
			if(this.cost!= null) {
				
				asset.setCost(cost);
				System.out.println(asset.cost);
			}
			
			asset.printFile();
			
		} catch (Exception ex) {
			
			jp.showMessageDialog(this, "Please ensure valid and complete entries");
		}
		
		
	}

}
