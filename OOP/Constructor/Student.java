package OOP.Constructor;

public class Student {
    
    public String Name;
    public int Id, Semester;
    public double Cgpa;

    // declaring constructor
    public Student() {}

    // parameterized constructor
    public Student(int id) {
        Id = id;
    }

    public Student(int id, String name) {
        Id = id;
        Name = name;
    }

    // setters
    public void setId(int id) {
        Id = id;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setSemester(int semester) {
        Semester = semester;
    }
    // getters
    public int getId() {
        return Id;
    }
    public String getName() {
        return Name;
    }
    public int getSemester() {
        return Semester;
    }

    public static void main(String[] args) {

        Student s1 = new Student(47698);
        s1.setName("Wasik");
        s1.setSemester(5);
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getSemester());
        
        Student s2 = new Student(50601, "Arik");

        System.out.println(s2.getId());
        System.out.println(s2.getName());
    }


}
