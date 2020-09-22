package assignment_3;

public class quastion7 {

	public static void main(String[] args) {
		
	
		
		int quarter,dime,nickel,money;
		money =34;
		
		quarter =money/25;
		money =money%25;
		
		dime =money/10;
		money=money%10;
		
		nickel =money/5;
		money=money%5;
		
		System.out.println("your chnage is " +quarter + " quaters," + dime +" dimes," + nickel + " nickels");
		

	}

}
