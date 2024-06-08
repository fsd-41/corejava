class MethodRecursion{
int i=0;
void display(){
   
System.out.println("hi");
if(i<5){
	i++;//1
display();//recursion
}
}
public static void main(String[] args){

MethodRecursion obj = new MethodRecursion();
obj.display();
}
}

class FactRecursion{
	
	int factEx(int i){//parameter
		
		if(i==1){
			return 1;
		}
		
		return i*factEx(i-1);/*   5*factEx(4)//5*24
								  4*fact(3)//4*6
                              3*fact(2)  //3*2 2*fact(1)//2*1							  
		
		
		*/
	}
	public static void main(String[] args){
		FactRecursion OBJ =new FactRecursion();
		System.out.println(OBJ.factEx(5));//argument
	}  
	
}