class pat1{
public static void main (String args[]){
	int j=0;
	int l=0;//1//2
	for(int i=4; i>0; i--){//3//2
		for(j=0; j<i; j++){
			System.out.print(" ");
			}
			l+=1;
			for(int k=0; k<l; k++){//l=2
				System.out.print("*");
				for(int m=0; m<1; m++){// i also fix m<l but i defenetly use break statement;
					System.out.print("*");
					//break;
				}
				
		}
		
		System.out.println();
	}
}
}
class pat2{
	public static void main(String args[]){
		for(int i=0; i<5; i++){
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
class pat3{
	public static void main (String args[]){
		for(int i=0; i<5; i++){
			for(int j=0; j<i; j++ ){
				for(int k=0; k<i; k++){
					System.out.print(" ");
				}
			System.out.print("*");
			}
			System.out.println();
		}
	}
}