public class Main {
    public static void main(String[] args) {
        int[] myArr = {6,4,3,3,1};
        int[] myArr2 = {6,4,3,4,1};
        System.out.println(IsDescending(myArr));
        System.out.println(IsDescending(myArr2));
    }
    public static boolean recursive(int[] arr, int size){
        //I verify if size is equal to 0 or 1, then return true cause there are nothing to sort,
        // I conclude that the array is already sorted
        if(size == 0 || size == 1){
            return true;
        }
        //Here I compare the first element with the last element and
        // if they are not equal I return false, it means the array is not sorted
        if(arr[size - 1] > arr[size - 2]){
            return false;
        }
        // And finnaly if any of my conditions is not statified, I call the recursive function
        // again with array and his size -1
        return recursive(arr, size - 1);
    }

    public static boolean IsDescending(int[] arr){
        return recursive(arr, arr.length);
    }

    // The complexity is then O(n) and n is the size of the array
}