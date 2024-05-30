// widencasting:
class a{
static int a=300;
static byte b =(byte)a; // int - byte
public static void main (String[]args){
System.out.println(b);
}
}
class b{
static long a=10000000;
static int c=(int)a;//long -int
public static void main(String[]args){
System.out.println(c);	
	
}	
	
}

class c {
static short a=124;
static byte x=(byte)a; //short - byte
public static void main(String[]args){
System.out.println(x);
}	
	
}
class abc{
	static int a=120;
	static char b=(char)a; // int - char
	public static void main(String[]args){
		System.out.println(b);
	}
	
}
class x{
	static char a='s';
	static int b=(int)a; // char - int
	public static void main(String[]args){
		System.out.println(b);
}
}
class d{
static short a=65;
static char b=(char)a;	//short - char
	public static void main(String[]args){
		System.out.println(b);
}
}
class e{
static char a='m';
static short b=(short)a;	//char - short
	public static void main(String[]args){
		System.out.println(b);
}
}

class e1{
static long a=123456789;
static short b=(short)a;	//long - short -- it may cause some data loss coz short can only hold -32768 to 32767
	public static void main(String[]args){
		System.out.println(b);
}
}
// widencasting:
class f{
static byte a= 90;
static int b = a;	//byte - int
	public static void main(String[]args){
		System.out.println(b);
}
}

class g{
static float a= 90.567f;
static double b = a;	//float - double
	public static void main(String[]args){
		System.out.println(b);
}
}