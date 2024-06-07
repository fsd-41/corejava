import java.util.Scanner;
class prime1{
	public static void main (String args[]){
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number");
		int Starting_Number=ss.nextInt();
		int count=0;
		for(int i=2; i<Starting_Number; i++){
			if(Starting_Number%i!=0){
				count=0;
			}
			else{
				count++;
				break;
			}
			
		}
		if(count==0){
			System.out.println(Starting_Number+" is a prime number");
		}
		else{
			System.out.println(Starting_Number+" is not a prime number");
		}
		
		}
			
		
	}