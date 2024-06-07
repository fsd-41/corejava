import java.util.Scanner;
class table{
	public static void main(String args[] ){
		Scanner ss=new Scanner(System.in);
		System.out.println("which table you want:");
		int a=ss.nextInt();
		for(int i=1; i<15; i++){
			int sum= i*a;
			int rem=sum%10;
			if(rem!=5 && rem!=7){
				System.out.println(i+"x"+a+"="+sum);
			}
		
			
		}
	}
}