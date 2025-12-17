package pattern;

public class IncresingOrDrecresingNoPyramid {
//	int n=0;
	public void IncreasingNo(int n) {
		  for(int i=1; i<=n; i++) {
			  for(int j=1; j<=i; j++) {
				  System.out.print(j + " ");
			  }
			  System.out.println();
		  }
	}
	public void dcreasingNo(int n) {
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
	public void noChaningPramid(int n) {
		int c =1;
		for(int i=1; i<n; i++) {
			for(int j =0; j<i; j++) {
				 System.out.print(c + " ");
				 c++;
			}
			System.out.println();
		}	  
	}
    public void noTringular(int n) {
		  for(int i=1; i<n; i++) {
			  for(int j =i; j<n; j++) {
				  System.out.print(" ");
			  }
			  for(int k=0; k<i; k++) {
				   System.out.print(i + " ");
			  }
			  System.out.println();
		  }
	}
public void zeroOneTriangle(int n) {
	 for(int i=1; i<=n; i++) {
		 for(int j =1; j<=i; j++) {
			 if((i+j)%2==0) {
				 System.out.print("1"+ " ");
			 }else {
			  System.out.print("0" + " ");
			 }	  
		 }
		 System.out.println();
	 }
}
	public void palindromeTriange(int n) {
		 for(int i=0; i<n; i++) {
			 for(int j=i; j<n; j++) {
				 System.out.print(" ");
			 }
			 for(int k=i; k>1; k--) {
				 System.out.print(  "{"+k+"}" );
			 }
			 for(int v=1; v<=i; v++) {
				 System.out.print(v+" ");
			 }
			 
			 System.out.println();
		 }
	}
	
	
}






















