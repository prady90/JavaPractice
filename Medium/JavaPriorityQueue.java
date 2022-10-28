import java.util.*;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */

class Student {
   private   int id;
    private String name;
    private double cgpa;
    public Student(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

}

class studentComparator implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        if(Double.compare(o2.getCgpa(), o1.getCgpa())==0){
            if(o1.getName().compareTo(o2.getName())==0){
                return Integer.compare(o1.getId(), o2.getId());
            }else{
                return o1.getName().compareTo(o2.getName());
            }
        }else{
            return Double.compare(o2.getCgpa(), o1.getCgpa());
        }
    }

}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pQueue = new PriorityQueue<Student>(new studentComparator());
        List<Student> studentList = new ArrayList<Student>();

        for (int i = 0; i < events.size(); i++) {
            String[] eventList = events.get(i).split(" ");
            String ops = eventList[0];
           
            if (ops.equals("ENTER")) {
                int id = Integer.valueOf(eventList[3]);
                double cgpa = Double.valueOf(eventList[2]);
                String name = eventList[1];
                Student st1 = new Student(id ,name , cgpa);
                pQueue.add(st1);
            } else {
                if (ops.equals("SERVED")) {
                    if(!pQueue.isEmpty()){
                        pQueue.remove();
                    }
                    
                }
            }
        }

        while(!pQueue.isEmpty()){
            studentList.add(pQueue.poll());
        }
        
        return studentList;
    }

}

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();


    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
