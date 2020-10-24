package club.banyuan.classDef;

public class Fridge {
    private final int heightInCm; // 用来判断东西是否可以放进来

//    final int maxStorage = 30; // 最大容量是30立方米
//    int currStorage; // 现在放了多少东西

//  保存冰箱里面有些什么东西 -- 容纳的物品
    private Elephant elephant;
    // 保存狮子
    private Lion lion;

    // 如何制造一台冰箱
    public Fridge(int height) {
        this.heightInCm = height;
        this.elephant = null;
        this.lion = null;
    }

    public Fridge() {
        this.heightInCm = 300;
        this.elephant = null;
        this.lion = null;
    }

    // 获取冰箱里的大象
    public Elephant remove() {
        if (this.elephant == null) {
            System.out.println("冰箱是空的，没法取大象出来");
            return null;
        } else {
            Elephant in = this.elephant;
            this.elephant = null;
            return in;
        }
    }

    // 将一只大象放入冰箱
    public boolean store(Elephant elephant) {
        if (this.elephant == null && this.lion == null) {
            // 当前冰箱是空的
            if (this.heightInCm < elephant.getHeightInCm()) {
                return false;
            } else {
                this.elephant = elephant;
                return true;
            }
        } else {
            // 判断一下冰箱里的大象是不是参数的那只大象
            if (this.elephant == elephant) {
                return true;
            } else {
                // 满的
                return false;
            }
        }
    }
    // 将一只狮子放入冰箱
    public boolean store(Lion lion) {
        if (this.elephant == null && this.lion == null) {
            // 当前冰箱是空的
            if (this.heightInCm < lion.getHeightInCm()) {
                return false;
            } else {
                this.lion = lion;
                return true;
            }
        } else {
            // 判断一下冰箱里的大象是不是参数的那只大象
            if (this.lion == lion) {
                return true;
            } else {
                // 满的
                return false;
            }
        }
    }


    // 输出冰箱的属性，以及里面有些什么东西，
    public void print() {
        System.out.println("冰箱的高度是" + this.heightInCm);
        System.out.println("冰箱里面有" + (elephant == null ? lion : elephant));
    }
}
