/**
 * Created with IntelliJ IDEA.
 * User: AA
 * Date: 10/2/13
 * Time: 11:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class LinearSearch {
    public static int LinearSearch(int[] A, int Size, int Target){
        for(int i = 0; i < A.length ; i++){
            if(A[i] == Target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] A = new int[9];
        A = new int[]{4, 7, 4, 6, 8, 9, 42, 1, 3};

        System.out.println(LinearSearch(A, A.length, 3));


    }

}
