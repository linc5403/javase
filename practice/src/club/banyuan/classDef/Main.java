package club.banyuan.classDef;

public class Main {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        Elephant elephant = new Elephant();
        if (fridge.store(elephant)) {
            // store成功
            System.out.println("存成功了");
            fridge.print();
        } else {
            System.out.println("存失败了");
            fridge.print();
            System.out.println(elephant);
        }

        // Elephant elephant2 = new Elephant();
        if (fridge.store(elephant)) {
            // store成功
            System.out.println("存成功了");
            fridge.print();
        } else {
            System.out.println("存失败了");
            fridge.print();
            System.out.println(elephant);
        }

    }
}
