zpackage good_number;

import java.util.Scanner;

/**
*
* @author skcet
*/
public class Good_number {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {

int n;
String s=&quot; &quot;;
int a[]=new int[100];
Scanner sc=new Scanner(System.in);

n=sc.nextInt();
for(int i=1;i&lt;=n;i++)

{
if(i==4)
{
s=s+&quot;3&quot;;
}
else if(i%2!=0)
{
s=s+&quot;1&quot;;
}

else if(i%2==0)
{
s=s+&quot;2&quot;;
}

}
System.out.println(s);
}

// TODO code application logic here
}
