import javax.swing.JFrame;

/**
*print a screen with a panel, the panel contains buttons that user 
*can select, text field where all the input/output goes in to, and a slider for user
*to choose what base the user want.
*@see base 16 calculator
*@see frame
*@see buttons 0-9, A-F, clear, =, +, -, *, /
*@see slider
*@see text field
*
**/
public class Base16Calculator {
	public static void main(String[] args) {
		createAndShowGUI();
	}

	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Base Calculator");
		frame.add(new Base16Panel());		// put the panel inside the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 500);		// set the size of the frame
		frame.setVisible(true);			// set the frame to be visibled
	}
}
