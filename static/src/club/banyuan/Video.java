package club.banyuan;

public class Video {
    // 成员变量的定义
    static private int zuJin;
    static {
        zuJin = 100;
    }
    private String title;

    static {
        zuJin = 5;
    }

    {
        maxDuration = 300;
    }

    //private int maxDuration = 60;
    private int maxDuration;
    {
        maxDuration = 60;
    }

    // 方法的定义
    public Video(String title) {
        this.title = title;
        this.maxDuration = 200;
    }

    public Video() {
    }

    public static void main(String[] args) {
        System.out.println(args);
        System.out.println("args len is " + args.length);
        for (String e:args) {
            System.out.println(e);
        }
        System.out.println("***********");
        Video video1 = new Video();
        System.out.println(video1.maxDuration);
        System.out.println(Video.zuJin);
    }
}
