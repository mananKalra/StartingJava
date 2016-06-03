import java.awt.FlowLayout; 
// how things are placed, gives default layout managing 
import javax.swing.JFrame; 
// windows features like title bar, minimize, maximize, x etc. 
import javax.swing.JLabel;
// for text and images on screen

public class next extends JFrame{
	private JLabel item1;
	
	public next(){
		super("Title bar"); // adding a title
		setLayout(new FlowLayout()); // gives default layout 
		
		item1 = new JLabel("Random sentence");
	    item1.setToolTipText("Show up on hover");
	    add(item1);
	}
}