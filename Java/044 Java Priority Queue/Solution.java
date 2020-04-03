import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */
class Student implements Comparable <Student> {    
    private int id;
    private String name;
    private double cgpa;
    public Student (int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID () {
        return id;
    }
    public String getName () {
        return name;
    }
    public double getCGPA () {
        return cgpa;
    }

    @Override
    public int compareTo(Student s) {
        if(this.cgpa != s.getCGPA()) {
            return Double.compare(s.getCGPA(), this.cgpa);
        } else {
            if(this.name.compareTo(s.getName()) == 0) {
                return Integer.compare(this.id, s.getID());
            } else {
                return this.name.compareTo(s.getName());
            }
        }
    }
}

class Priorities {
    
    List<Student> getStudents(List<String> events){
        java.util.PriorityQueue<Student> pq = new java.util.PriorityQueue<Student>();
        for(String s : events) {
            String[] sArr = s.split(" ");
            if(sArr[0].equals("ENTER")) pq.offer(new Student(Integer.parseInt(sArr[3]), sArr[1], Double.parseDouble(sArr[2])));
            if(sArr[0].equals("SERVED")) pq.poll();
        }
        ArrayList<Student> ls = new ArrayList<Student>();
        // 주석을 살려 print하면 pq에서 for loop 순서대로 뽑은것과 poll으로 뽑은것의 순서가 다름을 볼 수 있다.
        // for(Student s : pq) {
        //     System.out.println(s.getName() + " " + s.getCGPA() + " " + s.getID());
        // }
        while(!pq.isEmpty()) {
            Student s = pq.poll();
            ls.add(s);
            // System.out.println(s.getName() + " " + s.getCGPA() + " " + s.getID());
        }
        return ls;
    }
}

public class Solution {
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
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}