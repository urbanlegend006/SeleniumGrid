import java.util.Scanner;

public class IntegerArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 0;
        while(true){
            System.out.println("Enter the valid length");
             length = sc.nextInt();
            if(length>0){
                break;
            }
        }

        int[] arr = new int[length];

        for(int i=0; i<length; i++){
            arr[i] = sc.nextInt();
        }

        func(arr);
        printArray(arr);
    }

    private static void func(int[] input) {

        int size = input.length;
        int max = input[size-1];
        input[size-1] = 0;
        for(int i=size-2; i>=0; i--){
            int temp = input[i];
            input[i] = max;
            if(max<temp)
                max = temp;
        }
    }

    static void printArray(int arr[])
    {
        for (int i=0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
