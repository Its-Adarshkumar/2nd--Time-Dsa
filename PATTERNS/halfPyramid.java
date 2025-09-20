package PATTERNS;

public class halfPyramid {
    public static void main(String[] args) {
        int n=4;
        for(int line=1;line<=n;line++){
            for(int number=1;number<=line;number++){
                System.out.println(number);
            }
            System.out.println();
        }
    }
}
