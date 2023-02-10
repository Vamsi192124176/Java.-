import java.util.Scanner;
	class DAY5SUMOFDIGITSOFNDIGITNUMBER
	{
	    public static void main(String arg[])
	    {
        try
	        {
	            int m, n,sum,n1,c=0;
	            Scanner sc=new Scanner(System.in)            System.out.println("Enter the no.of.digits: "         m=sc.nextInt();
            System.out.println("Enter a number ");
	            n=sc.nextInt();.	            int n2=n;
	            while(n2>0)
57.	            {
	                n1=n%10;
59.	                c++;
60.	                n2=n2/10;
61.	
62.	            }
63.	            System.out.println("Digits:"+c);
64.	            if(m==c)
65.	            {
66.	                for(sum=0 ;n!=0 ;n/=10)
67.	                {
68.	                    sum+=n%10;
69.	                }
70.	                System.out.println("Sum of digits "+sum);
71.	            }
72.	            else
73.	            {
74.	                System.out.println("Enter the correct digit number");
75.	            }
76.	        }
77.	        catch(Exception e)
78.	        {
79.	            System.out.println("Due to character exception");
80.	        }
81.	
82.	    }
