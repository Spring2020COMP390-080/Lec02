package lec02.ex2;

public class Example2 {
	public static void main(String[] args) {
		// Unless you have a good reason to do otherwise,
		// just use int for integer numbers

		int a = 5;
		int b = -10;
		byte c = 50;
		short d = 10000;
		
		// These won't work because of type mismatch
		// int e = 2.5;
		// byte f = 200;
		// short g = a;
		
		// double and float can be used for real numbers
		// Unless you have a good reason otherwise, 
		// use double for real numbers
		
		double h = -123.456;
		double i = 1.987e2;
		
		char j,k;
		j = 'A'; 
		k = '\u00f1';
		
		boolean l = true;
		
		// Doing math with only integers always results 
		// in an integer (i.e., any fractional part is lost
		a = 8;
		b = 7;
		int res = a/b; // res is now 1
		System.out.println("res = " + res);
		
		// If one of the values to an operand is real, 
		// you'll get a real result.
		a = 10;
		h = 3.5;
		double dres = a/h; 
		System.out.println("dres = " + dres);
		
		// Be careful when mixing integer and reals
		// in an expression (especially with division)
		
		int num_right = 5;
		int num_questions = 8;
		double percentage = (num_right / num_questions) * 100.0;
		
		System.out.println("wrong percentage: " + percentage);
		
		percentage = ((num_right * 1.0) / num_questions) * 100.0;
		
		System.out.println("right percentage: " + percentage);
		
		// The ternary operator is very handy for 
		// choosing between two different values
		// based on a boolean result
		
		int unc_score = 100;
		int duke_score = 80;
		
		String winner = (unc_score > duke_score) ? "Heels" : "Devils";
		System.out.println("The winner is " + winner);
		
		// Operator precedence can affect the result
		a = 12;
		b = 10;
		int m = 11;
		
		res = a + b / m;
		System.out.println("dres = " + res);
		res = (a + b) / m;
		System.out.println("dres = " + res);

		// Boolean operators will "short circuit"
		// once they know the answer.
		// First left side is evaluated.
		// Then right side is evaluated, but only if necessary.
		
		a = 10;
		b = -5;

		boolean bres = (a > 5) && checkIfPositive(b);
		System.out.println("bres = " + bres);
		
		
		// checkIfPositive below is never called because
		// right side was enough.
		
		bres = (a > 5) || checkIfPositive(b);
		System.out.println("bres = " + bres);
		
		
		int aa = 5;
		int bb = 3;
		int cc = aa/bb;
		System.out.println(cc);
	}
	
	public static boolean checkIfPositive(int x) {
		System.out.println("Here I am in checkIfPositive");
		return (x > 0);
	}
	
}
