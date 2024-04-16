package Array;

public class Largest_number {
    public static void main(String[] args) {
        int arr[] = new int[]{14, 25, 12, 58, 32};
        int m = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
        }
        System.out.println("Largest element : " + m);
    }
}
