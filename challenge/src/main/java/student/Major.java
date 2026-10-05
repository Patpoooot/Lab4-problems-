package student;

public class Major {
   private static int nextId = 1;
   private int id;
   private String code;
   private String name;
   private Student[] students;
   private int studentCount;

   public Major() { 
        this.id = nextId++;
        this.students = new Student[50];
        this.studentCount = 0;
        this.code = "23";
        this.name = "computer science";
    }

   public Major(String code, String name) {
        this.id = nextId++;
        this.code = code;
        this.name = name;
        this.students = new Student[50];
        this.studentCount = 0;
   }

   public int getId() { return id; }
   public String getCode() { return code; }
   public String getName() { return name; }

   public void setId(int Id) { id = Id; }
   public void setCode(String Code) { code = Code; }
   public void setName(String Name) { name = Name; }

   @Override
   public String toString() {
        return "Major : " + name + " , with id : " + id + ", and code : " + code;
   }

   // Method to add a student
   public void addStudent(Student s) {
        students[studentCount] = s;
        studentCount++;
   }

   // Display all students in the major
   public void displayStudents() {
        System.out.println("\nList of all students in the major :");
        System.out.println("-------------------------------------\n");
        for(int i=0; i<studentCount; i++) {
            System.out.println(students[i]);
        }
   }

   public Student findStudentByCNE(String cne) {
        for (Student s : students) {
            if (s.getCne().equals(cne)) return s;
        }
        return null;
   }

   public int getStudentCount() {
        return studentCount;
   }

   public boolean removeStudent(String cne) {
        Student target = findStudentByCNE(cne);
        if (target != null) {
            int idx = -1;

            for(int i=0; i<studentCount; i++) {
                if(students[i] == target) {
                    idx = i;
                    break;
                }
            }

            for(int j=idx; j<studentCount-1; j++) {
                students[j] = students[j+1];
            }

            students[studentCount-1] = null;
            studentCount--;
            return true;
        }
        return false;
   }

   public void getOccupancyRate() {
        System.out.println("Computer Science capacity: 50 students");
        System.out.println("Current enrollment: " + studentCount + " students");
        System.out.println("Occupancy rate = " + 2*studentCount + "%");
   }

   public String getStudentListAsString() {
        StringBuilder r = new StringBuilder();

        for (int i=0; i<studentCount; i++) {
            r.append(students[i]);
            r.append("\n");
        }

        return r.toString();
   }
}
