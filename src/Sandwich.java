
public class Sandwich {
	
	static String breadType;
	static String mainIngred;
	static double price;
	
	public String getBreadType(){
		return breadType;
	}
	public String getMainIngred(){
		return mainIngred; 
	}
	public double getPrice() {
		return price; 
	}
	public void setBreadType(String newBreadType) {
		breadType = newBreadType;
	}
	public void setMainIngred(String newMainIngred) {
		mainIngred = newMainIngred;
	}
	public void setPrice() {
		price = 4.99;
	}
}