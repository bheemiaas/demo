class VorC{
boolean isVowel(char c){
boolean b=false;
String vow="aeiou";
String cons="bcdfghjklmnpqrstvwxyz";
if(vow.indexOf(c)>=0)
return true;
else
return false;
}
public static void main(String args[]){
VorC vc=new VorC();
if(vc.isVowel('f'))
System.out.println("it is vowel");
else
System.out.println("it is not a vowel");
}
}