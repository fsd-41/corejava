import java.util.Scanner;
class largest{
		public static void main(String args[]){
			System.out.println("Enter the three numbers:");
			Scanner ss=new Scanner(System.in);
			int a=ss.nextInt();
			int b=ss.nextInt();
			int c=ss.nextInt();
			if(a>b && a>c){
					System.out.println(a+" is a greatest number");
			}
			else if(b>a && b>c){
					System.out.println(b+" is a greatest number");
			}
			else{
				System.out.println(c+" is a greatest number");
			}
		}
	}