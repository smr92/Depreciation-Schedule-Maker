package depreciation;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ScrollPane extends JScrollPane {

	JTable table;
	
	ScrollPane() {
		
		String [] tableHeader = {"Year", "Current Depreciation", "Total"};
		table = new JTable();
		
		add(table);
	}
	
}
