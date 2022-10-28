

import java.util.*;

class StudentType {
    private int id;
    private String fname;
    private double cgpa;

    public StudentType(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class sortStudentlist implements Comparator<StudentType> {

    public int compare(StudentType s1, StudentType s2) {
        if( Double.compare(s2.getCgpa(), s1.getCgpa()) !=0){
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        }else if(Double.compare(s2.getCgpa(), s1.getCgpa())==0 && s1.getFname().compareTo(s2.getFname())!=0){
            return s1.getFname().compareTo(s2.getFname());
        }else{
            return Integer.compare(s1.getId(), s2.getId());
        }
        

    }

}

// Complete the code
public class sortWithComparator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<StudentType> studentList = new ArrayList<StudentType>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            StudentType st = new StudentType(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        // Collections.sort(studentList, new sortByName());
        // Collections.sort(studentList, Collections.reverseOrder());

         
         
         Collections.sort(studentList,new sortStudentlist());
        

        for (StudentType st : studentList) {
            System.out.println(st.getFname());

        }

        in.close();
    }

}
