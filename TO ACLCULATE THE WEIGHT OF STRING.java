package weight_of_string;
import java.util.Scanner;
public class Weight_of_string {
public static void main(String[] args) {
String s;
int sum=0;
int t=96;
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
String s1=s.toLowerCase();
char a[]=s1.toCharArray();
int l=a.length;
int ch=sc.nextInt();
switch(ch)
{
case 1:
for(int i=0;i&lt;l;i++)
{
int x= (int)a[i];
int res=x-t;
sum=sum+res;

}
System.out.println(sum);
break;
case 0:
for(int i=0;i&lt;l;i++)
{
if(a[i]!=&#39;a&#39;&amp;&amp;a[i]!=&#39;e&#39;&amp;&amp;a[i]!=&#39;i&#39;&amp;&amp;a[i]!=&#39;o&#39;&amp;&amp;a[i]!=&#39;u&#39;){
int x= (int)a[i];
int res=x-t;
sum=sum+res;
}
}
System.out.println(sum);
break;

// TODO code application logic here
}
}
}
