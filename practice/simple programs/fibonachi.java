import java.util.Scanner;
class fibo{
		public static void main(String args[]){
			Scanner ss=new Scanner(System.in);
			System.out.println("enter the number");
		    int input=ss.nextInt();
			int sum,a=0,b=1;
			for(int i=0; i<input; i++ ){
				sum=a+b;
				a=b;
				b=sum;
				System.out.println(sum);
			}
		}
	}