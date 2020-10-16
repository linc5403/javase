package club.banyuan;

public class VideoStore {
    private Video[] videos;
    private final int SIZE;

    public VideoStore(int size) {
        this.SIZE = size;
        this.videos = new Video[SIZE];
    }

    public VideoStore() {
        this.SIZE = 10;
        this.videos = new Video[SIZE];
    }


    public void addVideo(String title) {
        Video newVideo = new Video(title);
        for (int i = 0; i < SIZE; i++) {
            if (videos[i] == null) {
                videos[i] = newVideo;
                return;
            }
        }
        System.out.println("货架满了，没法放新的影片");
    }


    public boolean checkOut(String title) {
        boolean find = false;
        for (int i = 0; i < SIZE; i++) {
            if (videos[i] == null) {
                // 已经找完了
                System.out.println("没有这部影片 " + title);
                return false;
            } else {
                if (videos[i].getTitle().equals(title)) {
                    // 找到了
                    if (videos[i].isOut() == true) {
                        // 找到了但是已经被借出
                        System.out.println("影片 " + title + " 已经被借出");
                        return false;
                    } else {
                        // 找到了没有被借出
                        videos[i].setOut(true);
                        System.out.println("借出成功 " + title);
                        return true;
                    }
                }
            }
        }
        System.out.println("库存满的情况：没有这部影片 " + title);
        return false;
    }

    public void returnVideo(String title) {
        // 找这个title有没有
        for(int i = 0; i < SIZE; i++) {
            if (videos[i] == null) {
                System.out.println("没有这个影片 " + title);
                return;
            } else {
                if (videos[i].getTitle().equals(title)) {
                    // 找到了
                    if (videos[i].isOut() == true) {
                        System.out.println("还回 " + title);
                        videos[i].setOut(false);
                        return;
                    } else {
                        // 假设一个片名只有一部
                        System.out.println("顾客还回来的影片居然已经在店里了" + title);
                        return;
                    }
                }
            }
        }
        // 找遍了100个都没有这个影片
        System.out.println("库存满的情况：没有这个影片 " + title);
        return;
    }

    private int findByTitle(String title) {
        for (int i = 0; i < SIZE; i++) {
            if (videos[i] == null) {
                return -1;
            } else {
                if (videos[i].getTitle().equals(title)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void receiveRating(String title, int score) {
        int index = findByTitle(title);
        if (index == -1) {
            System.out.println("找不到这个影片 " + title);
            return;
        }
        videos[index].rate(score);
    }

    public void listInventory(){
        for (int i = 0; i < SIZE; i++) {
            if (videos[i] != null) {
                if (videos[i].isOut() == false) {
                    System.out.print("第" + i + "部影片: ");
                    videos[i].print();
                }
            } else {
                return;
            }
        }
        return;
    }

    /*
    void addVideo(String): 添加一个新的电影
    boolean checkOut(String): 根据片名借出电影
    returnVideo(String): 归还电影
    receiveRating(String, int) : 设置用户对电影的评分(1~5)，收到评分之后，计算该电影的平均评分，然后保存到Video的评分属性中
    listInventory(): 列出整个库存的电影。
     */
}
