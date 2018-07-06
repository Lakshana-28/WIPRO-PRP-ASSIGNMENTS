package palindrome__check;
import java.util.Scanner;
public class Palindrome__check {
public static char odd_check(char b[])
{
int l=b.length;

int flag=0,cnt=0;
for(int i=0;i&lt;l;i++)
{
for(int j=0;j&lt;l;j++)
{
if(i!=j)
{
if(b[i]!=b[j])
{
flag=1;
}
else
{
flag=0;
break;
}
}
}
if(flag==1)
{
cnt++;
}
}
if(cnt==1)
{
return &#39;2&#39;;
}
else if(cnt==0)
{
return &#39;2&#39;;
}

else
{
return &#39;1&#39;;
}

}
public static char even_check(char b[])
{
int l=b.length;
int flag=0,cnt=0;
for(int i=0;i&lt;l;i++)
{
for(int j=0;j&lt;l;j++)
{
if(i!=j)
{
if(b[i]!=b[j])
{
flag=1;
}
else
{
flag=0;
break;
}
}
}
if(flag==1)
{
cnt++;
}

}
if(cnt==0)
{
return &#39;2&#39;;
}

else {
return &#39;1&#39;;
}
}
public static void main(String[] args) {
String s;
int cnt=0;
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
char a[]=s.toCharArray();
int l=a.length;

StringBuilder sb=new StringBuilder(s);
StringBuilder b=sb.reverse();
String m=b.toString();
char c[]=m.toCharArray();
for(int i=0;i&lt;l;i++)
{
if(a[i]==c[i])
{
cnt++;
}
}
if(cnt==l)
{ System.out.println(&quot;2&quot;);

}
else if(l%2!=0)
{
char v=odd_check(a);
System.out.println(v);
}
else if(l%2==0)
{
char v=even_check(a);
System.out.println(v);
}
}
}
