/*
class is a java entity. -> logical -> physical(object)

interface,enum,annotation

non-static -> not referable
*/

class A{
static int x=25;
int y=55;
public static void main(String args[]){
A ob=new A();
System.out.println(x);
System.out.println(ob.y);
}
}

