
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//CopyPast1
//class Student{
//    String name;
//    int ages;
//    long phoneNumber;
//    int grades;
//
//
//    public Student(String name, int ages, long phoneNumber, int grades) {
//        this.name = name;
//        this.ages = ages;
//        this.phoneNumber = phoneNumber;
//        this.grades = grades;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAges() {
//        return ages;
//    }
//
//    public void setAges(int ages) {
//        this.ages = ages;
//    }
//
//    public long phoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(long phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public int getGrades() {
//        return grades;
//    }
//
//    public void setGrades(int grades) {
//        this.grades = grades;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name=' " + name + '\'' +
//                ", ages=" + ages +
//                ", phoneNumber=" + phoneNumber +
//                ", grades=" + grades +
//                '}';
//    }
//
//
//
//public static void main(String[] args){
//        Student student = new Student("Aiman", 18,87478963275L,92);
//        System.out.println(student.getName());
//
//        System.out.println("Old info: "+student);
//
//        student.setName("Baurzhan");
//        student.setAges(19);
//        student.setPhoneNumber(87475882190L);
//        student.setGrades(98);
//        System.out.println(student);
//    }}


//CopyPast2
//public class Main {
//    public static void main(String [] args){
//        ArrayList<Student> studentArrayList = new ArrayList<>();
//
//        Student student = new Student("Aiman",18,87478963275L,92);
//        Student student2 = new Student("Aslan",19,87052069875L,85);
//        Student student3 = new Student("Damir",19,87023189652L,99);
//
//        studentArrayList.add(student);
//        studentArrayList.add(student2);
//        studentArrayList.add(student3);
//
//         //print with for
//        for (Student s: studentArrayList){
//            System.out.println(s);
//        }
//
//    }
//}}


//CopyPast3
//public class Main {
//    public static void main(String [] args){
//        ArrayList<Student> studentArrayList = new ArrayList<>();
//
//        Student student = new Student("Aiman",18,87478963275L,92);
//        Student student2 = new Student("Aslan",19,87052069875L,85);
//        Student student3 = new Student("Damir",19,87023189652L,99);
//
//        studentArrayList.add(student);
//        studentArrayList.add(student2);
//        studentArrayList.add(student3);
//
//        System.out.println("Old list: "+studentArrayList);
//
//        System.out.println(studentArrayList.get(0));
//        Collections.sort(studentArrayList, new SortByAge());
//        System.out.println("Sorted by age: "+studentArrayList);
//
//        Collections.sort(studentArrayList, new SortByGrade());
//        System.out.println("Sorted by age: "+studentArrayList);
//
//        }
//
//    }
//class SortByAge implements Comparator<Student> {
//    @Override
//    public int compare(Student s1, Student s2) {
//        if (s1.getAges() == s2.getAges())
//            return 0;
//        if (s1.getAges() > s2.getAges())
//            return 1;
//        else
//            return -1;
//    }
//}
// class SortByGrade implements Comparator<Student> {
//     @Override
//     public int compare(Student s1, Student s2) {
//         if (s1.getGrades() == s2.getGrades())
//             return 0;
//         if (s1.getGrades() > s2.getGrades())
//             return 1;
//         else
//             return -1;
//     }
// }
//class SortByName implements Comparator<Student>{
//        @Override
//        public int compare(Student s1, Student s2) {
//            return s1.getName().compareTo(s2.getName());
//        }}
//
//

//CopyPast4
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Student> studentArrayList = new ArrayList<>();
//
//        Student student = new Student("Aiman", 18, 87478963275L, 92);
//        Student student2 = new Student("Aslan", 19, 87052069875L, 85);
//        Student student3 = new Student("Damir", 19, 87023189652L, 99);
//
//        studentArrayList.add(student);
//        studentArrayList.add(student2);
//        studentArrayList.add(student3);
//        System.out.println("Old list: " + studentArrayList);
//
//        Student s = getStudentByAge(studentArrayList, 18);
//        System.out.println(s);
//    }
//
//    public static Student getStudentByAge(ArrayList<Student> list, int age) {
//        Student res = null;
//        for (Student s : list) {
//            if (s.getAges() == age) {
//                res = s;
//            }
//        }
//        return res;
//    }
//}