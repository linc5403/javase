package club.banyuan;
public class Video {
    private String title; // 片名
    private boolean isOut; // true: 租出去了
    private double score; // 平均分
    private int scoreCount; // 多少人打了分

    public String getTitle() {
        return title;
    }

    public boolean isOut() {
        return isOut;
    }

    public void setOut(boolean out) {
        isOut = out;
    }

    public Video (String title) {
        this.title = title;
        isOut = false;
        score = 0;
        scoreCount = 0;
    }

    // 接收这部影片的评分
    public void rate(int score) {
        double total = this.score * scoreCount;
        this.score = (total + score) / (++scoreCount);
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", isOut=" + isOut +
                ", score=" + score +
                ", scoreCount=" + scoreCount +
                '}';
    }

    public void print() {
        System.out.println(this);
    }
}
