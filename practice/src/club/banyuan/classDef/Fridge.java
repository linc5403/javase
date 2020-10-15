package club.banyuan.classDef;

public class Fridge {
    private final int heightInCm; // 用来判断东西是否可以放进来

//    final int maxStorage = 30; // 最大容量是30立方米
//    int currStorage; // 现在放了多少东西

//  保存冰箱里面有些什么东西 -- 容纳的物品
    private Elephant elephant;

    // 如何制造一台冰箱
    public Fridge(int height) {
        this.heightInCm = height;
        this.elephant = null;
    }

    public Fridge() {
        this.heightInCm = 300;
        this.elephant = null;
    }

    public Elephant remove() {
        return null;
    }

    public boolean store(Elephant elephant) {
        if (this.elephant == null) {
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

    // 输出冰箱的属性，以及里面有些什么东西，
    public void print() {
        System.out.println("冰箱的高度是" + this.heightInCm);
        System.out.println("冰箱里面有" + this.elephant);
    }
}
