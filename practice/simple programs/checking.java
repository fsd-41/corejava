import java.util.Scanner;
class checking{
	public static void main(String []args){
		System.out.println("Enter the charcter:");
		Scanner ss=new Scanner(System.in);
		String cc=ss.nextLine();
		switch(cc){
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			System.out.println(cc+" its a vovel letter");
			break;
			default:
			System.out.println(cc+"its not an vovel letter");
		}
		/*Char cc=ss.nextLine().CharAt(0);
		switch(cc){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			System.out.println(cc+" its a vovel letter");
			break;
			default:
			System.out.println(cc+"its not an vovel letter");
		}
		*/
		int a=15;
		a=20;
		
		
	}
}