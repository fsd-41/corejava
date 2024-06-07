import java.util.Scanner;
class AtoZ{
	public static void main (String []args){
		char w='A';
		while(w<='Z'){
			System.out.println(w);
			w++;
		}
	}
}
class prime{
	public static void main (String args[]){
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number");
		int Starting_Number=ss.nextInt();
		for(int i=2; i<Starting_Number; i++){
			if(Starting_Number%i==0||Starting_Number%i==1){
				int k=(Starting_Number%i);
				if(k!=0){
					System.out.println("this is a prime number");
					break;
				}
				else{
					System.out.println("this is not a prime number");
				  break;
				}
			}
			
		}
		
		}
			
		
	}
	
	class swap{
		public static void main(String args[]){
			int a=10, b=20, c;
			c=a;
			a=b;
			b=c;
			System.out.println("a="+a+" b="+b);
		}
	}
	