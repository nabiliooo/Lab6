public class Coffee extends Beverage{
	
	private boolean extraShot;
	private boolean extraSyrup;
	private final double extraFEE = 0.5;	

	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup){
		super(bevName, Type.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}

	public double calcPrice(){
		double price = super.addSizePrice();
		
		if(extraShot == true){
			price += extraFEE;
		}
		
		if(extraSyrup == true){
			price += extraFEE;
		}
		
		return price;
	}
	

	public String toString(){
		String str = super.toString();
		
		if(extraShot == true){
			str = str + "extra shot, ";
		}
		
		if(extraSyrup == true){
			str = str + "extra syrup, ";
		}
		
		str = str + "Price was: " + calcPrice();
		return str;
	}
	

	public boolean equals(Coffee anotherBev){
		
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
	
		if(!(this.extraShot != anotherBev.extraShot)){
			status = false;
		}
		
		if(!(this.extraSyrup != anotherBev.extraSyrup)){
			status = false;
		}
		return status;
	}
	

	public boolean getExtraShot(){
		return extraShot;
	}
	

	public boolean getExtraSyrup(){
		return extraSyrup;
	}
}