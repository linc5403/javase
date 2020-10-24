package club.banyuan;

public class Fraction {
    private int fenZi;
    private int fenMu;

    public int getFenZi() {
        return fenZi;
    }

    public int getFenMu() {
        return fenMu;
    }

    // 获取公约数
    private int calcGongYueShu(int a, int b) {
        int min = a < b ? a:b;
        // 取分子分母小的那个，遍历，看看是否可以被分子和分母整除
        // 找最大公约数
        int gongYueShu = min;
        for(; gongYueShu >= 1; gongYueShu--) {
            if (a % gongYueShu == 0 && b % gongYueShu == 0) {
                break;
            }
        }
        return gongYueShu;
    }

    public Fraction(int fenZi, int fenMu) {
        // 化简分数
        int gongYueShu = calcGongYueShu(fenZi, fenMu);

        this.fenZi = fenZi / gongYueShu;
        this.fenMu = fenMu / gongYueShu;
    }

    double toDouble() {
        return ((double)fenZi) / fenMu;
    }

    Fraction plus(Fraction r) {
        int rFenZi = this.fenZi*r.fenMu + this.fenMu*r.fenZi;
        int rFenMu = this.fenMu * r.fenMu;
        return new Fraction(rFenZi, rFenMu);
    }

    void print() {
        if (fenMu == 1) {
            System.out.println(fenZi);
        } else {
            System.out.print(fenZi + "/" + fenMu + "\n");
        }
    }
}
