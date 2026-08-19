import java.util.Arrays;

class Student implements Comparable<Student>{
    String name;
    int rno;
    double cgpa;
    Student(String name,int rno,double cgpa){
        this.name=name;
        this.rno=rno;
        this.cgpa=cgpa;
    }
    public int compareTo(Student s){
        // return this.rno-s.rno;
        //return Integer.compare(this.rno, s.rno);
         return Double.compare(this.cgpa, s.cgpa);
    }
}

public class CustomComparator {
    public static void main(String[] args) {
        Student s1=new Student("adarsh", 100, 9.6);
        Student s2=new Student("anshu", 2, 8.3);
        Student s3=new Student("reena", 345, 4.2);
        Student s4=new Student("kanika", 4, 9.2);
        Student [] arr={s1,s2,s3,s4};
        Arrays.sort(arr);
        for (Student s:arr){
            System.out.print(s.name+" "+s.rno+" ");
        }
    }
}
