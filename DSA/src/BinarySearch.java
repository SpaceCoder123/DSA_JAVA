import java.sql.SQLOutput;

public class BinarySearch {

    // first case is that the input array is sorted in ascending order
    // second case is that the input array is sorted in descending order




    public static void main(String[] args) {
        int[] arr = {-18,-12,-4, 0,2,3,4};
        int[] arr2 = {5,4,3,2,1,0};
//        int ans = binarySearch(arr,15);
        int ans2 = OrderAgnosticBinarySearch.orderAgnostic(arr2,4);
        System.out.println(ans2);
    }




    // returns the index
    // else returns -1 if not found
    static int binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length;
//        int mid = (start + end) /2; // if you do this, the start and end might run out of the capacity of int holding value
         // taking the middle index and returning the value;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(target < arr[mid])
            {
                end = mid -1;
            } else if ( target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;

    }


}
