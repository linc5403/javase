package club.banyuan.ch6_Interface.d_clone;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CloneTest {
    private static class Foo implements Cloneable, Serializable {
        private LocalDate date;
        private Date cloneableDate;
        public Foo() {
            date = LocalDate.now();
            cloneableDate = new Date();
        }

        public void setDate(int y, int m, int d) {
            date = LocalDate.of(y, m, d);
        }

        public void setCloneableDate(int y, int m, int d) {
            cloneableDate = new Date(y, m, d);
        }

        @Override
        public String toString() {
            return "Foo{" +
                    "date=" + date +
                    ", cloneableDate=" + cloneableDate +
                    '}';
        }

        public Foo clone() throws CloneNotSupportedException {
            Foo n = (Foo) super.clone();
            n.cloneableDate = (Date)n.cloneableDate.clone();
            return n;
        }
    }

    public static void main(String[] args) {
        int [] luckyNumbers = {1, 2, 3, 4, 5};
        int [] newNumbers = luckyNumbers.clone();
        newNumbers[0] = 100;
        System.out.println(Arrays.toString(luckyNumbers));
        System.out.println(Arrays.toString(newNumbers));

        Foo[] foos = new Foo[1];


        Foo foo = new Foo();
        foos[0] = foo;

        // shadow copy
        System.out.println(foos[0]);
        System.out.println("***********************************");

        // Foo[] newFoos = foos.clone();
        Foo[] newFoos = Arrays.copyOf(foos, 1);
        newFoos[0].setDate(2012, 1, 1);
        newFoos[0].setCloneableDate(2012-1900, 1, 1);
        System.out.println(newFoos[0]);
        System.out.println("***********************************");
        System.out.println(foos[0]);
    }

}
