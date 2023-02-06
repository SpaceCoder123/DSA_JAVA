public class OrderAgnosticBinarySearch {
    public static int orderAgnostic(int[] arr, int target)
    {
         int start = 0;
         int end = arr.length-1;

//         find whether the array is sorted in ascending or descending order
        boolean isAscending = arr[start] < arr[end];
        while (start<= end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return  mid;
            }
            if(isAscending){
                if(target < arr[mid] )
                {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid] )
                {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return  -1;
    }
}
