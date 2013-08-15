import javax.swing.JOptionPane;

public class TestSandwich {
	
	public static void main(String[] args) {
		
		
		Sandwich mySandwitch = new Sandwich();
		
		String breType = JOptionPane.showInputDialog("What Type of bread?");
		mySandwitch.setBreadType(breType);
		
		String mIng = JOptionPane.showInputDialog("What is the Main Ingredient?");
		mySandwitch.setMainIngred(mIng);
	
	    mySandwitch.setPrice();
	    JOptionPane.showMessageDialog(null, "The Sandwitch on " + mySandwitch.getBreadType() + 
	    		" bread with " + mySandwitch.getMainIngred() + ". The over all Price is $"
	    		+ mySandwitch.getPrice()
	    		);
	}

}

