import java.util.Scanner;
class fact{
	public static void main (String []args){
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the number: ");
		int a=ss.nextInt();
		int f=1;
		int i=1; 
		while(i<=a){
			f=f*i;
			System.out.println(f);
			i++;
		}
		
	}
}