package password;

import java.util.Scanner;
public class Password {
public static void main(String[] args) {
String s;
int upp=0,low=0,spl=0,num=0,sum=0;
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
char a[]=s.toCharArray();
int l=a.length;
for(int i=0;i&lt;l;i++){
if(a[i]&gt;=&#39;A&#39;&amp;&amp;a[i]&lt;=&#39;Z&#39;)
{
upp++;
}
else if(a[i]&gt;=&#39;a&#39;&amp;&amp;a[i]&lt;=&#39;z&#39;)
{
low++;
}
else
if(a[i]==&#39;!&#39;||a[i]==&#39;@&#39;||a[i]==&#39;#&#39;||a[i]==&#39;$&#39;||a[i]==&#39;%&#39;||a[i]==&#39;^&#39;||a[i]==&#39;&amp;&#39;||a[i]==&#39;*&#39;||a[i]==&#39;(&#39;||a[i]=
=&#39;)&#39;||a[i]==&#39;-&#39;||a[i]==&#39;+&#39;)
{
spl++;
}
else if(a[i]&gt;=&#39;0&#39;&amp;&amp;a[i]&lt;=&#39;9&#39;)
{
num++;
}

}
sum=upp+low+spl+num;
if(upp&gt;0&amp;&amp;low&gt;0&amp;&amp;spl&gt;0&amp;&amp;num&gt;0&amp;&amp;sum&gt;=8)
{
System.out.println(&quot;Strong&quot;);
}
else if(upp&gt;0&amp;&amp;low&gt;0&amp;&amp;spl&gt;0&amp;&amp;sum&gt;=6)
{

System.out.println(&quot;Moderate&quot;);
}
else{
System.out.println(&quot;weak&quot;);
}

}

}
