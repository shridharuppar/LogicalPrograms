package com.bridgelabz.logicalprograms;

public class PerfectNumber {
public static void main(String[] args) {
	
	   int no=28;
	   int fsum=0;
	   int copy=no;
	     for (int i = 1; i<no; i++)
	   {
	      if (no%i==0)	
	      {
           fsum=fsum+i;
}
	   }
	         if (copy==fsum)
	     {
	    	 System.out.println("its a perfect number");
	     }
	          else
	     {
	    	 System.out.println("its not a perfect number");
	     }
}
}
