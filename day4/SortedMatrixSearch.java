
class SortedMatrixSearch { 

	private static void search(int[][] mat, 
									int n, int x) 
	{ 
		
		int i = 0, j = n - 1; 

		while (i < n && j >= 0) 
		{ 
			if (mat[i][j] == x) 
			{ 
				System.out.print(x+" is at " + 
									i + "," + j); 
				return; 
			} 
			if (mat[i][j] > x) 
				j--; 
			else 
				i++; 
		} 

		System.out.print("Element not found"); 
		return; 
	} 

	public static void main(String[] args) 
	{ 
		int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};

		search(mat, 3, 9); 
	} 
} 
 
