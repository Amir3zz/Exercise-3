import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void iterateCubes(int n) {
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < n; k++){
                    System.out.println("i: " + i + ", j: " + j + ", k: " + k);
                }
            }
        }
    }
    public static void iterateSquares (int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println("i; " + i + ", j: " + j);
            }
        }
    }

    public static ArrayList<Integer> generateRandomArray(int n){
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++){
            list.add(random.nextInt(1000000));
        }
        return list;
    }

    public static void bubbleSort1(ArrayList<Integer> arr) {
        int n = arr.size();
    }
    public static void main(String[] args){
        Runnable test = () -> iterateCubes(5);
        Runnable test2 = () -> iterateSquares(10);

        ArrayList<Integer> arr1 = new ArrayList<>(generateRandomArray(10000));
        ArrayList<Integer> arr2 = new ArrayList<>(generateRandomArray(10000));

        Runnable test3 = () -> Sort.bubbleSort1(arr1);
        Runnable test4 = () -> Sort.bubbleSort2(arr2);

        PerformanceMetrics.measureRuntime(test);
        System.out.println("============================================");
        PerformanceMetrics.measureRuntime(test2);
        System.out.println("============================================");
        PerformanceMetrics.measureRuntime(test3);
        System.out.println("============================================");
        PerformanceMetrics.measureRuntime(test4);
        System.out.println("============================================");


        //Inventory stuff after this
        System.out.println("Inventory Demonstration");
        Inventory inventory = new Inventory();

        inventory.displayItems();

        System.out.println(" ");

        Item paper = new Item("Paper");
        Item pen = new Item("Pen");
        Item pencil = new Item("Pencil");
        Item eraser = new Item("Eraser");

        System.out.println(" ");

        inventory.addItem(paper);
        inventory.addItem(pen);
        inventory.addItem(pencil);

        System.out.println(" ");

        inventory.displayItems();

        System.out.println(" ");

        System.out.println(inventory.hasItem(pencil));
        System.out.println(inventory.hasItem(eraser));

        System.out.println(" ");

        System.out.println("Total items: " + inventory.getItemCount());

        System.out.println(" ");

        inventory.removeItem(pencil);
        inventory.displayItems();
    }
}
