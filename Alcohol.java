/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: (Give a brief description for each Class)
 * Due: 07/31/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Nabil El-Hage
*/

public class Alcohol extends Beverage{
	private boolean isWeekend;
	private final double FEE = 0.60;

	public Alcohol(String bevName, Size size, boolean isWeekend){
		super(bevName, Type.ALCOHOL, size);
		this.isWeekend = isWeekend;
	}

	public double calcPrice(){
		double total = super.addSizePrice();
		
		if(isWeekend == true){
			total = total + FEE; 
		}
		return total;
	}

	public String toString(){
		String str = super.toString();
		
		if(isWeekend = true){
			str = str + "is offered during the weekend, ";
		}else{
			str = str + "is offered during the weekend, ";
		}
		str = str + "Price was: " + calcPrice();
		return str;
	}
	
	public boolean equals(Alcohol anotherBev){
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
	
		if(this.isWeekend != anotherBev.isWeekend){
			status = false;
		}
		return status;
	}
	
	public boolean isWeekend(){
		return isWeekend;
	}
}