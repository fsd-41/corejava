import java.util.Scanner;
class square{
		public static void main(String args[]){
			Scanner ss=new Scanner(System.in);
			System.out.println("Enter a range:");
			int i =ss.nextInt();
			int a;
			int w=1;
			while(w>0){
				for(a=0; a<i; a++){
					int sum=a*a;
					System.out.println(sum);
				}
				w--;
			}
		}
	}