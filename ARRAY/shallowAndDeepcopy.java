import java.lang.reflect.Array;
import java.util.Arrays;

public class shallowAndDeepcopy {
    public static void main(String[] args) {
        int [] arr={10,20,30,40};

        // int [] x=arr;   // x is shallow copy of arr
        // x[0]=100;

        int [] deep =Arrays.copyOf(arr, arr.length);
        deep[0]=100;
        System.out.println(deep[0]);
        System.out.println(arr[0]);
    }
}
 