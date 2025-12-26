package pattern;

public class IncresingOrDrecresingNoPyramid {
//	int n=0;
	public void IncreasingNo(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public void dcreasingNo(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public void noChaningPramid(int n) {
		int c = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
		}
	}

	public void noTringular(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public void zeroOneTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("1" + " ");
				} else {
					System.out.print("0" + " ");
				}
			}
			System.out.println();
		}
	}

	public void palindromeTriange(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = i; k > 1; k--) {
				System.out.print(k + " ");
			}
			for (int v = 1; v <= i; v++) {
				System.out.print("`" + v + " ");
			}

			System.out.println();
		}
	}

	public void squareHollow(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0 || i == n || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void squareFill(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void rhombus(int n) {
		for (int i = 0; i <= n; i++) {
			for (int s = 0; s < i; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= n; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	// right and left half pyramid
	public void rightHalfPyramid(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void rightReveHalfPyramid(int n) {
		for (int i = n; i > 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void leftHalfPyramid(int n) {
		for (int i = 0; i < n; i++) {
			for (int s = n; s > i; s--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}

	public void leftReveHalfPyramid(int n) {
		for (int i = 0; i < n; i++) {
			for (int s = 0; s <= i; s++) {
				System.out.print(" ");
			}
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//	     *
//	    * *
//	     *
	public void diamondPyramid(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

	public static void butterflyPyramid(int n) {
		for (int i = 1; i <= n; i++) { // 2
			for (int j = 1; j <= 2 * n; j++) {
				if (j > i && j <= 2 * n - i) { // 3 > 2 && 5 <= 6
					System.out.print(" ");
				} else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 1; j <= 2 * n; j++) {

				if (j > i && j <= 2 * n - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

//	  * * * 
//	  * * 
//	  * 
//	  * * 
//	  * * *
	public void kPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int k = 1; k < n; k++) {
			for (int l = 0; l <= k; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void hollowTriangelP(int n) {
		for (int i = 0; i < n; i++) {
			for (int s = i; s < n; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i || i == n - 1) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

//	 *
//	* *
//  *     *	
//* * * *  *
	public void hollowRevP(int n) {
		for (int i = 0; i < n; i++) {
			for (int s = 0; s < i; s++) {
				System.out.print(" ");
			}
			for (int j = i; j < n; j++) {
				if (i == 0 || j == i || j == n-1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
