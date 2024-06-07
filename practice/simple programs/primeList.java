import java.util.Scanner;
class list_prime{
		public static void main(String args[]){
			Scanner ss=new Scanner(System.in);
		System.out.println(" enter the number");
			int num=ss.nextInt();
			int count=0;
			int i;
			int t=2;
			while(t<num){
			for(i=2; i<num; i++){
				if(num%i!=0){
					count=0;
				}
				else{
					count++;
			break;
				}
			}
			if(count==0){
				System.out.println(num);
			}
			num--;
			
		}
		}
	}