package depreciation;

import java.awt.Desktop;
import java.io.File;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Asset {
	
	String assetType;
	int usefulLife;
	double cost;
	static int assetID;
	
	Asset ()  { 

		
	}
	
	public double getYearlyDepreciation() {
		
		double yearly = cost/usefulLife;
		
		return yearly;
	}
	
	public double getTotalDepreciation(int i) {
		
		double total = getYearlyDepreciation()*i;
		
		return total;
	}
	
	public void setAssetType(JTextField tf) {
		
		this.assetType = tf.getText();
	}
	
	public void setUsefulLife (JTextField tf) {
		
		int usefulLife;
		String input = tf.getText();
		usefulLife = Integer.parseInt(input);
		this.usefulLife = usefulLife;
	}
	
	public void setCost (JTextField tf) {
		
		double cost;
		String input = tf.getText();
		cost = Double.parseDouble(input);
		this.cost = cost;
	}
	
	
	public void printFile() throws Exception {
		
		String fileName = this.assetType + ".csv";
		File file = new File(fileName);
		PrintWriter pw = new PrintWriter(file);
		
		Desktop d = Desktop.getDesktop();

		String contents = assetType + "\nYEAR," +  "Current Depreciation," + "Total Depreciation";
		for (int i = 1; i <= this.usefulLife; i ++) {
			
			contents = contents + "\n" +  i+ "," + getYearlyDepreciation() + "," 
			+ getTotalDepreciation(i);
			
		}
		
		pw.print(contents);
		d.open(file);
		
		pw.close();
		


	}

}
