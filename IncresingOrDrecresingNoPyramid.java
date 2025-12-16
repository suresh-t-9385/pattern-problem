package pattern;

public class IncresingOrDrecresingNoPyramid {
	int n=0;
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
	
	
	
}






















