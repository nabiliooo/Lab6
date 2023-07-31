public abstract class Beverage {
	
	String beverageName;
	Type type;			
	Size size;
	private double basePrice = 2.00;
	private double sizeUpFee = 1.00;

	
	public Beverage(String bevName, Type type, Size size){
		this.beverageName = bevName;
		this.type = type;
		this.size = size;
	}

	public abstract double calcPrice();
	public String toString(){
		String str = "Beverage name: " + beverageName + ", Size: " + size + ", ";
		return str;
	}

	public boolean equals(Beverage anotherBev){
		boolean status = true;
		
		if(!(this.beverageName.equals(anotherBev.beverageName))){
			status = false;
		}
		
		if(!(this.type.equals(anotherBev.type))){
			status = false;
		}
		
		if(!(this.size.equals(anotherBev.size))){
			status = false;
		}
		
		return status;
	}
	
	public double addSizePrice(){
		basePrice = 2.0;
		
		if(size.equals(Size.SMALL)){
			basePrice = 2.0;
		}
		
		if(size.equals(Size.MEDIUM)){
			basePrice += sizeUpFee;
		}
		
		if(size.equals(Size.LARGE)){
			basePrice += (sizeUpFee*2);
		}
		
		return basePrice;
	}
	

	public double getBasePrice(){
		return basePrice;
	}
	

	public Type getType(){
		return type;
	}

	public String getBevName(){
		return beverageName;
	}
	

	public Size getSize(){
		return size;
	}
}