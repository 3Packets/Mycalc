
public class MyCalc {

	
		// TODO Auto-generated method stub
		public static int add(int num1, int num2){
			return num1 + num2;

		}
		public static int subtract(int num1, int num2){
			return num1 - num2;
		
		}
		public static int multiply(int num1, int num2){
			return num1 * num2;
		}
		public static int divide(int num1, int num2){
			return num1 / num2;
		}
		public static int square(int num1){
			return num1 * num1;
		}
		
		public static void main(String args []) {
			System.out.println(MyCalc.add(4, 3));
			System.out.println(MyCalc.subtract(4, 3));
			System.out.println(MyCalc.multiply(4, 3));
			System.out.println(MyCalc.divide(4, 3));
			System.out.println(MyCalc.square(4));
		}
}