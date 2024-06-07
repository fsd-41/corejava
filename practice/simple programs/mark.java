import java.util.Scanner;
class mark{
	public static void main(String []agrs){
		System.out.println("please enter your makr:");
		Scanner ss=new Scanner(System.in);
		//int grade = mk/10;-----its one type of logic becase its give me the hole number for ex:98/10=9--- i will fit into my switch case---case 9: sout=grade a like this...
		/*char grade='F';
		int mk=ss.nextInt();
		if(mk<=100 && mk>=90){
			grade='A';
		}
		else if(mk<90 && mk>=80){
			grade='B';
		}
		else if(mk<80 && mk>=70){
			grade='C';
		}
		else if(mk<70 && mk>=60){
			grade='D';
		}
	    else if(mk<60 && mk>=50){
			grade='E';
		}
		else{
			grade='F';
		}*/
		switch(grade)
		{
			case 'A':
			System.out.println("you got a 'A' grade");
			break;
			case 'B':
			System.out.println("you got a 'B' grade");
			break;
			case 'C':
			System.out.println("you got a 'C' grade");
			break;
			case 'D':
			System.out.println("you got a 'D' grade");
			break;
			case 'E':
			System.out.println("you got a 'E' grade");
			break;
			case 'F':
			System.out.println("you are fail");
			break;
		}
		
	}
}