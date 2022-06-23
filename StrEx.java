class StrEx{
public static void main(String args[]){
String s="hyderabad";
System.out.println(s.length());
System.out.println(s.toUpperCase());
String s1="ABCD";
System.out.println(s1.toLowerCase());
System.out.println(s.lastIndexOf('z'));
System.out.println(s.charAt(5));
System.out.println(s.substring(3,6));
System.out.println(s.compareToIgnoreCase("Hyderabad"));
System.out.println(s.equalsIgnoreCase("Hyderabad"));
System.out.println(s.replace("d","D"));
}
}

//ASCII

/*
a-z  97-122
A-Z  65-90
0-9  48-57

a-n=97-110=-13
*/