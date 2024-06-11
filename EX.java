
class Ex{
static{
System.out.println("FROM Static");
}
 Ex(){
     System.out.println("FROM constructor");
 }
 {
  System.out.println("FROM instance");
 } 
  public static void main(String[] args) {
       
Ex obj = new Ex();

    }
}