package ArrayLists;

public class mergeSort {
    public static void merge(int[]c,int []a,int []b){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){ // a[i] se element ko c mai dala isilye i++ and k++
                c[k]=a[i];
                i++;
                k++;  //c[k++]=a[i++] post operator
            }else{  // b[j] se element ko c mai dala isilye j++ and k++
                c[k]=b[j];
                j++;
                k++;
            }
        }
        // a array khatam -> b ke bache hue ele to
                while(j<b.length){
                    c[k]=b[j];
                    j++;
                    k++;
                }
            
                while(i<a.length){
                    c[k]=a[i];
                    i++;
                    k++;
                }
    }
    public static void main(String[] args) {
        int [] a= {2,5,6,9,20};
        int []b= {1,3,4,5,7,8};

        int [] c=new int [a.length+b.length];
        merge(c,a,b);
        for (int ele:c){
            System.out.print(ele+" ");
        }
    }
}
