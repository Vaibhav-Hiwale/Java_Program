package Basic;

public class TechNumber {

	public static void main(String[] args) 
	{
       int num=2025;
       int count=0;
       int temp=num;
       int sum=0;
       int sqr=1;
       int c=1;
       for(; num>0; count++)
       {
    	   int rem=num%10;
    	   num/=10;
       }
	   System.out.println(count);
       
    	   for(int j= 1; j<=count/2; j++ )
    	   {
    		    c=c*10;
    	   }
//    		   System.out.println(count);
    		    System.out.println(c);
    	   if(count%2==0)
    	   {
	       int a=temp/c;
	       int b=temp%c;
	       
//	       System.out.println(a);
	       sum=a+b;
	       System.out.println(sum);
	       sqr=sum*sum;
	       
//	       System.out.println(sqr);
	       
	       if(temp==sqr)
	       {
	    	   System.out.println("Tech Number:"+temp);
	       }
	
	}
	
	}
       }
	

