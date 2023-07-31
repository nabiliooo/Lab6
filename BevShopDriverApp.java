import java.util.Scanner;
public class BevShopDriverApp {

	private static final int MIN_AGE_FOR_ALCOHOL = 21;
	private static int amount = -100;
	private static int time;
	

	public static void main(String[] args) {
		BevShop bevShop = new BevShop();
		Scanner input = new Scanner(System.in);
		Customer customer = new Customer("", 0);

		System.out.println("Currently your order can have at most is " + bevShop.getMaxOrderForAlcohol() + " alcoholic beverages.");
		System.out.println("The minimum age to order alcohol drink is " + bevShop.getMinAgeForAlcohol() + ".");
		System.out.println("Start new order: ");
		bevShop.startNewOrder(0, Day.MONDAY, "", 100);
		
		System.out.println("Your Total Order for now is: " + bevShop.getCurrentOrder().calcOrderTotal());

		System.out.print("Would you please enter your name: "); 
		String name = input.nextLine();
		customer.setName(name);

		System.out.print("Would you please enter your age: ");
		int age = input.nextInt();
		input.nextLine();
		customer.setAge(age);

		if(bevShop.isValidAge(age)){
			System.out.println("You're at the appropriate age and eligible to order alcohol.\n");
			System.out.print("Please, could you tell me the time? (only the hour): ");
			time = input.nextInt();
			
			if(bevShop.isValidTime(time)) {
				System.out.println("Yes, this is an appropriate time!");
			}else{
				System.out.println("Oh no! This isn't a good time for alcohol!");
			}
		}else{
				System.out.println("You're not eligible to order alcohol, sorry!\n");
		}
		
		
		if(bevShop.isValidAge(age) && bevShop.isValidTime(time)) {
			System.out.print("How many alcoholic beverages would you like?:  ");
			amount = input.nextInt();
		}
		while(!(amount > -1) && !(amount <= 3)) {
			System.out.println("Oh no! You can only have up to " + bevShop.getMaxOrderForAlcohol() + " alcoholic beverages. Try again!");
			amount = input.nextInt();
		}
		
			
		
	}
}