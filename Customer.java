public class Customer {
	
	private String cusName;
	private int cusAge;
	
	public Customer(String cusName, int cusAge){
		this.cusName = cusName;
		this.cusAge = cusAge;
	}

	public Customer(Customer c){
		this.cusName = c.cusName;
		this.cusAge = c.cusAge;
	}
	
	public void setAge(int cusAge){
		this.cusAge = cusAge;
	}

	public void setName(String cusName){
		this.cusName = cusName;
	}
	
	public int getAge(){
		return cusAge;
	}
	

	public String getName(){
		return cusName;
	}
	
	public String toString(){
		String str = "Name: " + cusName + ", Age: " + cusAge;
		
		return str;
	}
}