import java.util.Scanner;
class palindrome{
		public static void main(String args[]){
			Scanner ss=new Scanner(System.in);
			System.out.println("enter the number:");
			int num=ss.nextInt();
			int dd=num;
		    int rem=0;
			int rev=0;
			while(num!=0){
				rem=num%10;//3
				rev=rev*10+rem;//30
				num=num/10;//12
				
			}
			if(rev==dd){
				System.out.println(dd+" yes its a palindrome");
			}
			else{
				System.out.println(dd+" its not a palindrome");
			}
		}
	}
	