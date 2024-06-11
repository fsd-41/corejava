class ShallowCopy{
    
    int i,j;
    ShallowCopy(){
        System.out.println("from shallow copy");
            }
public static void main (String[] args){
    ShallowCopy obj = new ShallowCopy();
    ShallowCopy obj1 = obj;
    ShallowCopy obj2 = obj;
  
   
   // ShallowCopy obj1 = obj;//shallow
    obj.i=89;
    obj.j=34;

System.out.println(obj);//89
System.out.println(obj1);


}
}

class DeepCopy{
 int i;
 int j;
 int k;
  DeepCopy(){
System.out.println("from deep copy");
 }

    public static void main (String[]  args){
         DeepCopy obj= new DeepCopy();
         DeepCopy obj1= new DeepCopy();
obj.i=67;
obj.j=45;
obj.k=23;
obj1.i=obj.i;//deep copy
System.out.println(obj.i);//67
System.out.println(obj1.i);//67


    }
}