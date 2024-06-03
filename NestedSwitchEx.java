
import java.util.*;
class NestedSwitch{


public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.println("enter gender:");
String gender = sc.nextLine();
System.out.println("enter product:");

String product= sc.nextLine();

switch (gender){
	
	case "male":
	 switch (product)
	 {
		 case "Wallet":
		 System.out.println("wallet price 1500");
		 break;
		 case "bike":
		 System.out.println("bike price 2.3L");
		 break;
	default :
	System.out.println("no product found");
		 break;
	 }
	case "female":
	switch (product)
	 {
		 case "Wallet":
		 System.out.println("wallet price 7000");
		 break;
		 case "kurta":
		 System.out.println("wallet price 1500");
		 break;
		 case "lipostick":
		 System.out.println("bike price 2k");
		 break;
	default :
	System.out.println("no product found");
		 break;

  
}
}
}
}
