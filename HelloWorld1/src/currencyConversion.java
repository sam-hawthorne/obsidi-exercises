import java.util.Scanner;
public class currencyConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What currency would you like to convert to? \n USD $ \n GBP £ \n EUR € \n Yuan ¥ \n BTC ฿");
		String currency = sc.nextLine();
		System.out.println("What's the dollar value of your CAD you would like to convert?");
		float value = sc.nextFloat();
		float usd = (float) 0.73;
		float gbp = (float) 0.68;
		float eur = (float) 0.76;
		float yuan = (float) 5.29;
		float btc = (float) 0.000038;
		float result = 0;
		sc.close();
			switch (currency) {
				case "USD":
					result = value * usd;
					System.out.println("$" + value + " CAD is equal to $" + result + " USD ");
					break;
					
				case "GBP":
					result = value * gbp;
					System.out.println("$" + value + " CAD is equal to £" + result + " GBP ");
					break;
					
				case "EUR":
					result = value * eur;
					System.out.println("$" + value + " $CAD is equal to €" + result + " EUR ");
					break;
					
				case "Yuan":
					result = value * yuan;
					System.out.println("$" + value + " $CAD is equal to ¥" + result + " Yuan ");
					break;
					
				case "BTC":
					result = value * btc;
					System.out.println("$" + value + " $CAD is equal to " + result + " BTC ");
					break;
					
				default:
					System.out.println("Invalid input");
			}
			
	}

}
