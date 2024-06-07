import java.util.Scanner;
class positive{
		public static void main(String args[]){
			Scanner ss=new Scanner(System.in);
			System.out.println("enter the number:");
			int a=ss.nextInt();
			if(a<0){
				System.out.println("it is a negative number");
			}
			else if(a>0){
				System.out.println("it is a positive number");
			}
			else{
				System.out.println("neither positive or negative");
			}
		}
	}