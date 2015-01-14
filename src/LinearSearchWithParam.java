import java.util.ArrayList;
import java.util.List;

public class LinearSearchWithParam {

    public static void main(String[] args){

        System.out.println(linearSearchWithParam(1000,1980,13,17));
    }
    public static int linearSearchWithParam(int first, int last,int mod1, int mod2){

        int i = last;
        while (i >= first && !(i%mod1==0) | !(i%mod2==0)) {
            i--;
        }
        return i;
    }

}
