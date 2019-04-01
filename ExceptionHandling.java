
public class ExceptionHandling {
	public static void main(String[] args) throws MyException {
		//todo:
		//1.) Execute the following program. It will throw Exceptions.
		//Catch the Exceptions using their proper Names till no further
		//exceptions occur.
		//
		//2.) Taking the square root of a negative number won't cause
		//the exception. Write your own Exception for this case and 
		//write a method which throws this exception

		try{
			int a = 5;
			int b = 0;
			int div = a/b;
		} catch (ArithmeticException e){
			System.err.println( "Oops ... division by zero is not supported." );
			//e.printStackTrace();
		} 

		try{
			int[] arr = new int[5];
			arr[5] = 7;
		} catch (ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		
		try{
			String one = "one";
			int i = Integer.parseInt(one);
		} catch (NumberFormatException e){
			e.printStackTrace();
		}
		
		try{
			//Shift this block to a new method please which then will be called in the try-catch block
			double c = -7.0;
			if( c < 0.0 ) {
				throw new MyException("Result  is negative ");
			}
			double d = Math.sqrt(c);
			System.out.println(d);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}