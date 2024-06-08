class Emp{
 int eid;
 String name;
 static String ceo;
 float salary;

public static void main(String[] args){

Emp praveen = new Emp();
Emp Ganesh = new Emp();
praveen.eid=1;
Ganesh .eid=2;
praveen.name="karthi";
Ganesh.name ="gomathi";
praveen.salary=110000.45f;
Ganesh .salary=21000.45f;
praveen.ceo="lanson";
Ganesh.ceo="lansonlose";
System.out.println(praveen.eid +" : "+praveen.name+" : "+praveen.salary+" : "+praveen.ceo);
System.out.println(Ganesh.eid +" : "+Ganesh.name+" : "+Ganesh.salary+" : "+Ganesh.ceo);
}
}
class MethodOverload{
	
	
	
	void add(int a){
		System.out.println (a+10);
	}
	void add(int a, int b){
		System.out.println (a+b);
	}
	void add(){
		System.out.println ("no parameter");
	}
	void add(int a, double d){
		add();
		System.out.println ("no parameter");
	}
	public static void main (String[] args){
		
		MethodOverload obj = new MethodOverload();
		
		obj.add (9,8);
		obj.add(7,9.8);
}}