import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       String  str=sc.next();
       int i;
        char ch[]=str.toCharArray();
    for(i=0;i<ch.length;i++)
    {
        if(Character.isUpperCase(ch[i]))
        ch[i]=Character.toLowerCase(ch[i]);
    }
    String st=new String(ch);
    System.out.println(st);
}
}

output:
=>AsDfGh

asdfgh

=>HELLO

hello





