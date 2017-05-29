import honam.inc.oop.chap06.lib.Calculator;
import honam.inc.opp.chap06.app.GoodCalc;

public class TestDrive0529 {

	public static void main(String[] args) {
		int [] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Calculator mycal = new GoodCalc();
		System.out.println(mycal.add(10, 5));
		System.out.println(mycal.subtract(10, 5));
		System.out.println(mycal.average(input));
	}

}
