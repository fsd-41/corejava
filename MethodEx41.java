 class 	Methodex{
 int a=10;
 static int b=90;
void display(){

	
System.out.println("from instance method"+a+" "+b);

}
static void display1(){
	Methodex obj1 = new Methodex();
	System.out.println("from static display method"+obj1. a+" "+b);
}
public static void main (String[] args){
Methodex obj = new Methodex();
	System.out.println("from  main method:"+obj.a+" "+b);

Methodex.display1();
obj.display1();
display();
obj.display();
}
}