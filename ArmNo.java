package Basic;

public class ArmNo {

	public static void main(String[] args)
	{
      int num=153;  //  153=num%10
      int sum=0;
      int temp=num;
      for(; num>0; num/=10)
      {
    	  int rem=num%10;
    	 sum=sum+(rem*rem*rem);
    	 
    	 System.out.println(sum);
     
	}
    	 if(temp==sum)
    	 {
    		 System.out.println("Armstrome Number :"+sum);
    	 }

}}
