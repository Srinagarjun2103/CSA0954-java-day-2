import java.util.*;
public class lcmgcd 
class lcmgcd
{
	public static void main(String[] args) 
  	static int gcd(int a, int b)  
  	{  
    		return b == 0? a:gcd(b, a % b);
	}
  	static int LcmOfArray(int[] arr, int idx)
  	{
    		if (idx == arr.length - 1)
		{
			return arr[idx];
    		}
    		int a = arr[idx];
   		int b = LcmOfArray(arr, idx+1);
    		return (a*b/gcd(a,b)); 
  	}
	static int _gcd(int a, int b)  
  	{  	
		if(a==0)
		{
			return b;
		}
    		return _gcd(b%a,a);
	}
	static int figcd(int arr[],int n)
	{
		int n1,n2,n3,gcd=1,lcm,ch;
		Scanner sc=new Scanner(System.in);
		System.out.print("N: ");
		ch=sc.nextInt();
		if(ch<0)
		int result=arr[0];
		for(int i=0;i<n;i++)
		{
			System.out.println("Invalid Enter only positive integers");
			return;
			result=gcd(arr[i],result);
		}
		if(ch==2)
		return result;
	}
  	public static void main(String[] args)
  	{
 		int n,i,j,k,_gcd=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of elements: ");	
		n=sc.nextInt();
		if(n<=0)
		{
			System.out.print("Enter number 1: ");
			n1=sc.nextInt();
			System.out.print("Enter number 2: ");
			n2=sc.nextInt();
    			for(int i = 1; i <= n1 && i <= n2; ++i) 
			{
      			if(n1 % i == 0 && n2 % i == 0)
				{
        				gcd = i;	
				}	
    			}
			lcm = (n1 * n2) / gcd;
    			System.out.println("LCM = "+lcm);
			System.out.println("GCD = "+gcd);
			System.out.print("Invalid");
			return;
		}
		else if(ch==3)
    		int[] arr = new int[n];
		for(i=0;i<n;i++)
		{
			System.out.print("Enter number 1: ");
			n1=sc.nextInt();
			System.out.print("Enter number 2: ");
			n2=sc.nextInt();
			System.out.print("Enter number 3: ");
			n3=sc.nextInt();
    			for(int i = 1; i <= n1 && i <= n2; ++i) 
			{
      			if(n1%i==0 && n2%i==0 && n3%i==0)
				{
        				gcd = i;	
				}	
    			}
			lcm = (n1*n2*n3)/gcd;
      			System.out.println("LCM = "+lcm);
			System.out.println("GCD= "+gcd);
			System.out.print("Number "+(i+1)+": ");
			arr[i]=sc.nextInt();
		}

	}
		System.out.print("LCM= "+LcmOfArray(arr, 0)+ "\n");
		System.out.println("GCD= "+figcd(arr,n));
  }
}
