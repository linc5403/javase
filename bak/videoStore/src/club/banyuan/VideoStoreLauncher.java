package club.banyuan;

public class VideoStoreLauncher{

    public static void main(String[] args) {
	// write your code here
//        Video v1 = new Video("Matrix");
//        Video v2 = new Video("GodFather");
//        Video v3 = new Video("StarWar");
        VideoStore store = new VideoStore(3);
        store.addVideo("Matrix");
        store.addVideo("GodFather");
        store.addVideo("StarWar");
        store.receiveRating("Matrix", 4);
        store.receiveRating("GodFather", 4);
        store.receiveRating("StarWar", 5);
        System.out.println("*******************************************************");
        store.listInventory();
        System.out.println("*******************************************************");
        String[] titles = new String[] {"StarWar", "GodFather", "Matrix"};
        for (String e: titles) {
            store.checkOut(e);
        }
        store.listInventory();
        System.out.println("*******************************************************");
        store.receiveRating("GodFather", 5);
        store.returnVideo("GodFather");
        store.listInventory();
        System.out.println("*******************************************************");
    }
}
