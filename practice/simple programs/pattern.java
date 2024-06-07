class pat{
	public static void main(String args[]){
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
class pat1{
	public static void main(String args[]){
		int a=1;
		for(int i=0; i<5; i++){
			for(int j=0; j<4; j++){
				System.out.print(a);
			}
			a++;
			System.out.println();
		}
	}
}
class pat2{
	public static void main(String args[]){
		int a=0;
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				System.out.print(a);
				a=a+2;
			}
			
			System.out.println();
		}
	}
}
class pat3{
	public static void main(String args[]){
		for(int i=0; i<5; i++){
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
class pat4{
	public static void main(String args[]){
		for(int i=0; i<4; i++){
			for(int j=i; j<4; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
class pat5{
	public static void main(String args[]){
		for(int i=0; i<5; i++){
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
}
}
class pat6{
	public static void main(String args[]){
		int d=1;
		int l=1;
		for(int a=5; a>0; a--){
		for(int b=a; b>0; b--){
			System.out.print(" ");
		}
		
		for(int c=0; c<d; c++){
		System.out.print(" *");
		}
		
		System.out.println("");
		d++;
    }
	for(int i=5; i>0; i--){
		System.out.print(" ");
		for(int j=0; j<i; j++){
			System.out.print(" *");
		}
		System.out.println();
		for(int k=0; k<l; k++){
			System.out.print(" ");
		}
		l++;
		
	}
	  
	}
}
