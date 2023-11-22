import java.util.StringTokenizer;
public class StringToken {
   public static void main (String[]ars) {
	   int Evencount=0,i,Oddcount=0;
	   StringTokenizer st=new  StringTokenizer("10 20 30 40 67 43 64 26 55");
	   int count=st.countTokens();
	   System.out.println("Number of tokens is:"+count);
	  while(st.hasMoreTokens()) {
	   int num= Integer.parseInt(st.nextToken());
	   if(num%2==0) {
		   Evencount++;
	   }
	   else
	   {
		   Oddcount++;
	   }
	   }     
		   System.out.println("Even count: "+Evencount);
		   System.out.println("Odd count: "+Oddcount);
   }
}
