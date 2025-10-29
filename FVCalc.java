// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int cV = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int time = Integer.parseInt(args[2]);
		double fV = cV * Math.pow((1 + rate / 100), time);
		System.out.println("After " + time + " years, $" + cV + " saved at " + rate +
		"% will yield $" + (int) fV);
	}
}