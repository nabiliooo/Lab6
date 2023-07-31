import java.util.Random;
import java.util.ArrayList;


public class Order implements OrderInterface, Comparable {
	
	private int orderTime;
	private Day orderDay;
	private Customer cust;
	Random random = new Random();
	int num;

	private Beverage beverage;
	private ArrayList<Beverage> order = new ArrayList<>();
	
	public Order(int orderTime, Day orderDay, Customer cust){
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.cust = cust;
	}
	

	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup){
		beverage = new Coffee(bevName, size, extraShot, extraSyrup);
		order.add(beverage);
		
	}
	

	public void addNewBeverage(String bevName, Size size){
		beverage = new Alcohol(bevName, size, isWeekend());
		order.add(beverage);
	}
	

	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein){
		beverage = new Smoothie(bevName, size, numOfFruits, addProtein);
		order.add(beverage);
	}
	

	public int generateOrder(){
		int num = random.nextInt(10000) + 90000;
		return num;
	}
	

	public int getOrderNo(){
		return num;
	}
	

	public int getOrderTime(){
		return orderTime;
	}
	

	public Day getOrderDay(){
		return orderDay;
	}
	

	public Customer getCustomer(){
		return cust;
	}

	public Day getDay(){
		return orderDay;
	}
	
	
	public boolean isWeekend(){
		boolean status = false;
		
		if(orderDay.equals(Day.SATURDAY) || orderDay.equals(Day.SUNDAY)){
			status = true;
		}
		return status;
	}
	

	public Beverage getBeverage(int itemNo){
		return order.get(itemNo);
	}
	

	public int getTotalItems(){
		return order.size();
	}
	

	public double calcOrderTotal(){
		double total = 0;
		
		for(int i = 0; i < order.size(); i++){
			total += order.get(i).calcPrice();
		}
		return total;
	}
	

	public int findNumOfBeveType(Type type){
		int num = 0;
		for (int i = 0; i < order.size(); i++){
			if(order.get(i).getType().equals(type)){
				num += 1;
			}
		}
		return num;
	}
	
	
	public String toString(){
		String str = "Order #: " + generateOrder() + ", Order time: " + getOrderTime() + ", Day: " + getOrderDay() + ", Name: " + cust.getName() + ", Age: " + cust.getAge() + ", Beverages: ";
		
		for(int i = 0; i < order.size(); i++){
			str = str + getBeverage(i).toString() + " ";
		}
		return str;
	}


	public int compareTo(Order anotherOrder) {
		int num = 0;
		
		if(this.getOrderNo() > anotherOrder.getOrderNo()){
			num = 1;
		}else if(this.getOrderNo() < anotherOrder.getOrderNo()){
			num = -1;
		}
		return num;
	}

	@Override
	public int compareTo(Object o){
		return 0;
	}

}