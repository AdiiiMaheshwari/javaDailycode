package Array;

public class Second_largest_number {
    public static void main(String[] args) {
        int temp;

        int arr[] = new int[]{10, 25, 45, 26, 35, 89};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[arr.length - 2]);
    }
}
