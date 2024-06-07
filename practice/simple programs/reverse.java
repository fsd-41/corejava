import java.util.Scanner;
class reverse{
		public static void main(String args[]){
			Scanner ss=new Scanner(System.in);
			System.out.println("enter the number:");
			int num=ss.nextInt();
		    int rem=0;
			int rev=0;
			while(num!=0){
				rem=num%10;//3
				rev=rev*10+rem;//30
				num=num/10;//12
				
			}
			System.out.println(rev);
		}
	}
	