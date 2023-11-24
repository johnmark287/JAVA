public class Exception {
	public static void main(String[] args) {
		int i = 8, j = 2, k = 3;

		try
		{
			k = i/j;
			int a[] = new int[4]; 

			for (int k2 = 0; k2 <= a.length; k2++) {
				a[k2] = k2;
			}
		}
		
		catch (ArithmeticException e) {
			System.out.println("Can't divivde by 0. " + e);
		} 
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of bounds. " + e);
		} 
		
		catch (Exception e) {
			System.out.println("Unknown.");
		}

	}
}