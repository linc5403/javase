package club.banyuan.classDef;

public class Main {

    static Lion createLion(int heightInCM) {
        Lion lion = new Lion(heightInCM);
        return lion;
    }

    static void storeLion(Fridge fridge, Lion lion) {
        if (fridge.store(lion)) {
            // store成功
            System.out.println("存成功了");
            fridge.print();
        } else {
            System.out.println("存失败了");
            fridge.print();
            System.out.println(lion);
        }
    }

    static void storeElephant(Fridge fridge, Elephant elephant) {
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


    public static void main(String[] args) {
        Fridge fridge = new Fridge();

        Lion l = createLion(200);
        storeLion(fridge, l);



        System.out.println("**********");
        Elephant inFridge = fridge.remove();
        fridge.print();
        System.out.println(inFridge);
        System.out.println("**********");


        Elephant elephant = new Elephant();
        storeElephant(fridge, elephant);

        Elephant elephant2 = new Elephant();
        storeElephant(fridge, elephant2);

        System.out.println("**********");
        inFridge = fridge.remove();
        fridge.print();
        System.out.println(inFridge);
        System.out.println("**********");

        Lion lion = new Lion();
        storeLion(fridge, lion);




    }
}
