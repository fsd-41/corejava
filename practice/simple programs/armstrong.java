import java.util.Scanner;
	class arm{
		public static void main(String args[]){
			System.out.println("enter the three digit number:");
			Scanner ss=new Scanner(System.in);
			//int num=ss.nextInt();
			int num=152;
			int k=num;
			int a=0,b=0,c=0,i=1;
		/*	while(i<2){
				a=num%10;//3
				i++;
			}
			
		num=num/10;//15
			while(i<3){
				b=num%10;//5
				i++;
			}
			
			num=num/10;//1
			while(i<4){
				c=num%10;//1
				i++;
			}
			*/
			while(i>0){
				a=num%10;//3
				num/=10;//15
	            b=num%10;//5
				num/=10;//1
				c=num%10;//1
				i--;
				
			}
			
			int sum=((a*a*a)+(b*b*b)+(c*c*c));
			if(sum==k){
				System.out.println(k+" is a armstrong number");
			}
			else{
				System.out.println(k+" is not a armstrong number");
			}
			
			
		}
	}