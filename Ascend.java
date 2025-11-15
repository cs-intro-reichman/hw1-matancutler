// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * (num + 1));
		int b = (int) (Math.random() * (num + 1));
		int c = (int) (Math.random() * (num + 1));
		System.out.println(a + " " + b + " " + c);

		int min = Math.min(a,(Math.min(b,c)));
		int max = Math.max(a,(Math.max(b,c)));
		int mid = a + b + c - min - max;
		System.out.println(min + " " + mid + " " + max);
	}
}

// Great!
// Optional - if youre always adding 1 to num - a.k.a 'num+1'
// you can define after line number 5:
// num = num + 1;

