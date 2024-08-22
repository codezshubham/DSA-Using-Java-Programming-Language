import java.util.*;
public class PriorityQueue {
    public static class Student{
        String name;
        int rollno;
        float marks;
    }
    public static class StudentComparator implements Comparator<Student>{
        public int compare(Student s1, Student s2){
            if(s1.marks < s2.marks) return 1;
            else if(s1.marks > s2.marks) return -1;
            else{
                if(s1.rollno > s2.rollno) return 1;  // reverse answer
                else if(s1.rollno < s2.rollno) return -1;
                else return 0;
            }
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>(new StudentComparator());  // By default Min Heap

        Student shubham = new Student();
        shubham.name = "Shubham";
        shubham.rollno = 22453;
        shubham.marks = 97.5f;

        Student nandi = new Student();
        nandi.name = "Nandi";
        nandi.rollno = 22444;
        nandi.marks = 97.5f;

        studentPriorityQueue.add(shubham);
        studentPriorityQueue.add(nandi);

        System.out.println(studentPriorityQueue.peek().name);
        System.out.println(studentPriorityQueue.peek().rollno);
        System.out.println(studentPriorityQueue.peek().marks);
    }
}
