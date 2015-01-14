/**
 * Created with IntelliJ IDEA.
 * User: AA
 * Date: 10/2/13
 * Time: 11:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class BinarySearch {
    public static int BinarySearch(int[] a, int target){
        int low = 0;
        int high = a.length;
        while (low + 1 < high){
            int test = (low + high)/2;
            if (a[test] < target){
                low = test;
                System.out.println(low);
            }else {
                high = test;
                System.out.println(high);
            }


        }
        if (a[high] == target){
            return high;
        }else {
            return -1;
        }
    }
    public static void main (String[] args){
        int[] a;
        a = new int[]{1, 2, 3, 4, 5};
        BinarySearch(a,1);

    }
}
