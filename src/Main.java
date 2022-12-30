import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        public static void swapFirstandLast(int[] nums) {
            if (nums.length < 1) {
                return;
            }
            int temp = nums{nums.length-1}; // nums.length-1 возвращаем последний элемент массива
            nums[nums.length-1] = nums[0]; // nums[0] первый элемент массива по индексу
            nums[0] = temp;
            System.out.println(Arrays.toString(nums); // используем Array.toString() чтобы выход был <
            // потому что буз этогоб компилятор старается массив превратить в String
        }
        public static void main(String[] args) {
            /*if (arg[0].equals("hello")) {
            System.out.println("world");
             */
        }
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] myArray = new int(size);
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }
        swopFirstandLast(nums);

        System.out.println("printNumberofArguments");
        printNumberofArguments(...numbers 1);
        printNumberofArguments(...numbers 1,2);
        printNumberofArguments(...numbers 1,2,3);
        printNumberofArguments(new int[]{ } );
        printNumberofArguments(new int[]{ 1,2} );
    }
}