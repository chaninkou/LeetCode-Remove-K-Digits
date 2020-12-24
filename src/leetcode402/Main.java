package leetcode402;

public class Main {
	public static void main(String[] args) {
		String num = "1432219";
		
		int k = 3;
		
		System.out.println("Num: " + num + " k: " + 3);
		
		RemoveLowerDigits solution = new RemoveLowerDigits();
		
		System.out.println("Solution: " + solution.removeKdigits(num, k));
	}
}
