/**
 * Created with IntelliJ IDEA.
 * User: AA
 * Date: 9/18/13
 * Time: 11:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class EuclidsAgorithm {
    public static int gcd(int a, int b){
        if (b == 0) return a;
        int r = a % b;
        System.out.println(r);
        return  gcd(b, r);
    }
    public static void main (String[] args){
    gcd(1547,560);
    //System.out.println(gcd(1333,1712));

    }
}
