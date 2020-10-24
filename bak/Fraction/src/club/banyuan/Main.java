package club.banyuan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Fraction fenShu1 = new Fraction(4, 3);
        double r = fenShu1.toDouble();
        System.out.println(r);
        // plus
        Fraction fen2 = new Fraction(10, 6);
        System.out.println("分母");
        System.out.println(fen2.getFenMu());
        Fraction r1 = fenShu1.plus(fen2);

        System.out.println(r1.getFenZi());
        System.out.println(r1.getFenMu());

        r1.print();
    }
}
