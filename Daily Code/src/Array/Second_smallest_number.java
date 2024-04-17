package Array;

public class Second_smallest_number {
    public static void main(String[] args) {
        int arr[]=new int[]{10,45,25,47,69,89,23};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Second smallest number : "+arr[arr.length-2]);
    }
}
