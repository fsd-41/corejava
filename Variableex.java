class Variable{

int q;//declare
int a=10;//intialize -- instance variable (r) non-static variable
static int b=909;//static variable
public static void main (String[] args){
	
	int d=90;//local variable
Variable obj = new Variable();// obj creation
System.out.println(" hi");
obj.q=12;//assign value
obj.q=89;//reassign
System.out.println(obj.a);
System.out.println(b);
System.out.println(obj.q);
System.out.println(d);
}


}