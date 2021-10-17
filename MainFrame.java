package depreciation;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	Pane pane = new Pane();
	
	
	MainFrame() {
		
		setVisible(true);
		setSize(500,200);
		setResizable(false);
		setTitle("Depreciation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(pane);
	}

}
