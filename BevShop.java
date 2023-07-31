/*
 * Class: CMSC203 
 * Instructor: Prof Thai
 * Due: 12/5/22
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Nabil El-Hage
*/
import java.util.ArrayList;

public class BevShop implements BevShopInterface {
	
	private ArrayList<Order> order = new ArrayList<>();

	public boolean isValidTime(int time){
		boolean status = false;
		
		if(time > 8 && time < 23){
			status = true;
		}
		
		return status;
	}
	

	public int getMaxNumOfFruits(){
		return MAX_FRUIT;
	}
	

	public int getMinAgeForAlcohol(){
		return MIN_AGE_FOR_ALCOHOL;
	}
	

	public boolean isMaxFruit(int numOfFruits){
		boolean status = false;
		
		if(numOfFruits > getMaxNumOfFruits()){
			status = true;
		}else{
			status = false;
		}
		return status;
	}
	

	public int getMaxOrderForAlcohol(){
		return MAX_ORDER_FOR_ALCOHOL;
	}
	

	public boolean isEligibleForMore(){
		boolean status = true;
		
		if(getNumOfAlcoholDrink() >= MAX_ORDER_FOR_ALCOHOL){
			status = false;
		}
		
		return status;

	}
	

	public int getNumOfAlcoholDrink(){
		int total = 0;
		
		for(int i = 0; i < order.size(); i++){
			if(order.get(i).findNumOfBeveType(Type.ALCOHOL) > MAX_ORDER_FOR_ALCOHOL){
				total = MAX_ORDER_FOR_ALCOHOL;
				i = order.size();
			}else{
				total = order.get(i).findNumOfBeveType(Type.ALCOHOL);
			}
		}
		return total;
	}
	

	public boolean isValidAge(int age){
		boolean status = true;
		if(age < MIN_AGE_FOR_ALCOHOL){
			status = false;
		}
		return status;
	}
	

	public void startNewOrder(int time, Day day, String customerName, int customerAge){
		Customer cust = new Customer(customerName, customerAge);
		Order orderUp = new Order(time, day, cust);
		order.add(orderUp);
	}
	
	
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup){
		Order orders = order.get(order.size()-1);
		orders.addNewBeverage(bevName, size, extraShot, extraSyrup);
	}
	

	public void processAlcoholOrder(String bevName, Size size){
		Order orders = order.get(order.size()-1);
		orders.addNewBeverage(bevName, size);
	}
	

	public void processSmoothieOrder(String bevName, Size size, int numOfFruit, boolean addProtein){
		Order orders = order.get(order.size()-1);
		orders.addNewBeverage(bevName, size, numOfFruit, addProtein);
	}
	

	public int findOrder(int orderNo){	
		
		int num = -1;
		
		for(int i = 0; i < order.size(); i++){
			if(order.get(i).getOrderNo() == orderNo){
				num = i;
				i = order.size();
			}
		}
		return num;
		
	}
	

	public double totalOrderPrice(int orderNo){
		double total = 0.0;
		int num = findOrder(orderNo);
				
		if(num != -1){
			total = order.get(num).calcOrderTotal();
		}
		
		return total;
	}
	

	public double totalMonthlySale(){
		double total = 0;
		
		
		for(int i = 0; i < order.size(); i++){
			total += order.get(i).calcOrderTotal();
		}
		
		return total;
	}

	public int totalNumOfMonthlyOrders(){
		return order.size();
	}

	public Order getCurrentOrder(){
		return order.get(order.size()-1);
	}
	

	public Order getOrderAtIndex(int index){
		return order.get(index);
	}

	public void sortOrders(){
		
		int min;
		Order od;
		
		for(int i = 0; i < order.size(); i++){
			min = i;
			for(int k = i + 1; k < order.size(); k++){
				if(order.get(k).compareTo(order.get(min)) < 0){
					min = k;
				}
			}
			od = order.get(min);
			order.set(min,  order.get(i));
			order.set(i,  od);
		}
	}
	
	public String toString(){
		String str = ""; 
		
		for(int i = 0; i < order.size(); i++){
			str = str + order.get(i).toString() + " ";
		}
		str = str + "Total monthly sale: " + totalMonthlySale();
		return str;
	}
}