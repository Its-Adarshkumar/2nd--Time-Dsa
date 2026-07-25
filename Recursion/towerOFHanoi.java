public class towerOFHanoi {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }

    public static void hanoi(int n,char src, char helper,char dest){

        if(n==0) return;

        //take n-1 disks from A to B via C
        hanoi(n-1,src,dest,helper);

        //largest disk from A to B 
        System.out.println(src+"->"+dest);

        //take n-1 disks from B to C via A
        hanoi(n-1,helper,dest,src);

    }
}
