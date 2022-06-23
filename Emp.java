class Emp{
int id=100;
String name;
static String compName="iaas";
public static void main(String args[]){
Emp e1=new Emp();
Emp e2=new Emp();
e2.id=555;
e2.compName="xyz";
System.out.println(e1.id+"\t"+e2.id);
System.out.println(e1.compName+"\t"+e2.compName);

}
}