package Task1;



public class myclass {

	public static void main(String[] args)  {
		
	   
		power(10);
		
		}

	public static void power(int n) {
		long [] a = new  long [n];
	    a[0]=1;
	    a[1]=1;
	    System.out.print(a[0] + " " + a[1] + " ");
	   // System.out.println(a[1]);
	    
		for (int i=2;i<a.length;i++) {
		
		System.out.print((a[i]= a[i-1]+a[i-2]) + " ");
		}
	}
}
		
			
		
	

