package FUNCTIONS;

public class binToDec {

    public static void binTodec(int binNum){
        int myNum=binNum;
        int dec=0;
        int pow=0;
        while(binNum>0){
            int lastDigit=binNum % 10;
            dec=dec+(lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum=binNum /10;
        }
        System.out.println("Decimal of " + myNum + " is " + dec);
    }
    public static void main(String[] args) {
        binTodec(1000);
    }
}
