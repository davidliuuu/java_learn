import java.util.Scanner;

public class ex02 {

    private static int[] bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            boolean Flag = false; //判斷是否發生交換，若無交換則跳出迴圈
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    Flag = true;
                }
            }
            if (!Flag)
            {
                break;
            }
        }
        return array;
    }


    public static void main(String[] args){
        int x ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入需要排序的數字總數: ");
        x = scanner.nextInt();
        System.out.println(x);

        int[] array = new int[x];

        for (int i = 0 ; i<x ;i++){
            scanner = new Scanner(System.in);
            System.out.print("請輸入需要排序的數字: ");
            int y = scanner.nextInt();
            System.out.println(y);

            array[i] = y ;
        }

        for (int i = 0 ; i < array.length ; i++ ){
            System.out.print(array[i]+" ");
        }
        System.out.print("\n");

        array = bubbleSort(array);


        for (int i = 0 ; i < array.length ; i++ ){
            System.out.print(array[i]+" ");
        }
    }
}
