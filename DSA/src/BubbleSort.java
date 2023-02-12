public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{ 5,8,6,3,22,31,1,11,21,42,22,0 };
//        BubbleSort(arr);
        int[] out = BubbleSort.BubbleS(arr);
        for (int i = 0; i<out.length;i++){
            System.out.print(out[i]+" ");
        }
    }
    public static int[] BubbleS(int[] arr){

        // sorting the array using swap mechanism
        int n = arr.length;
        for (int i = 0; i<n-1;i++){
            for (int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    // O(n^2) time complexity and therefore is stable but time consuming when compared to other sorting algorithms
    // as the length of the array increases
}
