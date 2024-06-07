import java.util.Scanner;
	class odd{
		public static void main(String args[]){
			Scanner ss=new Scanner(System.in);
			System.out.println("enter the number");
			int num=ss.nextInt();
			int i=1;
			while(i<=num){
				if(num%2!=0){
					System.out.println(num);
				}
				num--;
			}
		}
	}
	