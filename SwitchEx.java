/*
1)switch only handle expression not a condition.
2)can have N no of case.
3)case value should be literal or constant. can't pass two or more vaule for one case.
4)case value mustbe unique.no duplication allowed
5)expression of float and double data type  not applicable.
6)each case statement can have break,it used to jump the control after switch expression
7)if break not found ,it executes next case
default is optional here.


*/



import java.util.Scanner;
class Switch{

public static void main(String[] args){
	System.out.println("Enter no:");
	Scanner sc = new Scanner(System.in);
   int no = sc.nextInt();
 
switch (no){

case 0:
System.out.println(" it is zero");
break;
case 10:
System.out.println(" it is ten");
break;
case 20:
System.out.println(" it is twenty ");
break;
case 30:
System.out.println(" it is 3");
break;
default :
System.out.println(" no isnot listed ");

}

}
}
class FindVowels{
public static void main(String[] args){
	Scanner sc1 = new Scanner(System.in);
	char ch =sc1.next().charAt(0);
switch (ch){

case 'A':
case 'E':
case 'I':
case 'o':
case 'u':
System.out.println(" it is vowls");
break;
default :
System.out.println(" no isnot vowel .it is consonent ");

}
}
	
}

