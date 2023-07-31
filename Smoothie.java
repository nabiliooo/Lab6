public class Smoothie extends Beverage {

	private int numOfFruit;
	
	private boolean addProtein;
	private double proteinPrice = 1.50;
	private double fruitPrice = 0.50;

	public Smoothie(String bevName, Size size, int numOfFruit, boolean addProtein){
		super(bevName, Type.SMOOTHIE, size);
		this.numOfFruit = numOfFruit;
		this.addProtein = addProtein;
		}

	public double calcPrice(){
		double price = super.addSizePrice();
		
		if(numOfFruit >= 1){
			price = price + (numOfFruit*fruitPrice);
		}
		
		if(addProtein == true){
			price = price + proteinPrice;
		}
		
		return price;
		
	}

	public String toString(){
		String str = super.toString();
		
		if(addProtein == true){
			str = str + "Protein was added, ";
		}
		
		if(numOfFruit >= 1){
			str = str + numOfFruit + " fruits were added, ";
		}
		str = str + "Price was: " + calcPrice();
		return str;
	}
	

	public boolean equals(Smoothie anotherBev){
		
		boolean status = true;
		if(!(super.beverageName.equals(anotherBev.beverageName))){
			status = false;
		}
		
		if(!(super.type.equals(anotherBev.type))){
			status = false;
		}
		
		if(!(super.size.equals(anotherBev.size))){
			status = false;
		}	
	
		if(this.addProtein != anotherBev.addProtein){
			status = false;
		}
		
		if(this.numOfFruit != anotherBev.numOfFruit){
			status = false;
		}
		return status;
	}
	
	public boolean getAddProtein(){
		return addProtein;
	}
	
	public int getNumOfFruits(){
		return numOfFruit;
	}
}