package student;

import instructor.Instructor;
import instructor.Subject;

public class Test {
    public static void main(String[] args) {

        Major m1 = new Major("23", "Computer Science");
        Major m2 = new Major("13", "Hospitality & Management");
        Major m3 = new Major("03", "Aplyed Physics");

        Student s1 = new Student("Adam", "Ajerouassi", "0661456555", "Adam.AJEROUASSI@um6p.ma", "L123456", m1);
        m1.addStudent(s1);
        Student s2 = new Student("Ahmad", "Ibhi", "0660405130", "Ahmad.IBHI@um6p.ma", "CA133456", m1);
        m1.addStudent(s2);
        Student s3 = new Student("Oussama", "El Hilali", "0619805444", "Oussama.ELHILALO@um6p.ma", "BK13453", m1);
        m1.addStudent(s3);

        Student s4 = new Student("Farah", "Atrahouch", "0671456555", "Farah.ATRAHOUCH@um6p.ma", "N12356", m3);
        Student s5 = new Student("Siraj", "El Mensori", "0712345509", "Siraj.ELMENSORI@um6p.ma", "L155935", m2);

        // Display computer science students
        m1.displayStudents();

        //Formatted names
        System.out.println("\nFormatted names:");

        System.out.println(s1.getFullNameFormatted());
        System.out.println(s2.getFullNameFormatted());
        System.out.println(s3.getFullNameFormatted());

        //Test findStudentByCNE()
        System.out.println("\nSearch for student with CNE CA133456:");
        Student found = m1.findStudentByCNE("CA133456");

        if (found != null) {
            System.out.println("Student found:");
            System.out.println(found);
        } else {
            System.out.println("Student not found.");
        }

        // Test getStudentCount()
        System.out.println("\nNumber of students:");

        System.out.println(
                "Computer Science: " + m1.getStudentCount()
        );

        System.out.println(
                "Hospitality & Management: " + m2.getStudentCount()
        );

        System.out.println(
                "Applied Physics: " + m3.getStudentCount()
        );

        // Test getOccupancyRate()
        m1.getOccupancyRate();
        m2.getOccupancyRate();
        m3.getOccupancyRate();

        // Test getStudentListAsString()
        System.out.println("\nComputer Science student list:");
        System.out.println(m1.getStudentListAsString());

        // Test removeStudent()
        System.out.println("\nRemoving student CA133456...");
        boolean removed = m1.removeStudent("CA133456");
        System.out.println("Student removed: " + removed);

        // Check number of students after removal
        System.out.println("Number of CS students after removal: " + m1.getStudentCount());


        // Test Instructor
        System.out.println("\nTesting Instructor:");

        Instructor instructor = new Instructor(
                1,
                "Ajerouassi",
                "Adam",
                "0661456555",
                "adam@example.com",
                "EMP 123"
        );

        System.out.println("Summary: " + instructor.summaryLine());
        System.out.println("Clean employee number: "
                + instructor.cleanEmployeeNumber());
        System.out.println("Display name: " + instructor.displayName());
        System.out.println("Card:\n" + instructor.toCard());


        // Test Subject
        System.out.println("\nTesting Subject:");

        Subject subject = new Subject(
                "Ajerouassi",
                "Adam",
                "0661456555",
                "adam@example.com",
                "EMP 123",
                101,
                "cs 101",
                "introduction to programming"
        );

        System.out.println("Normalized code: " + subject.normalizedCode());
        System.out.println("Proper title: " + subject.properTitle());
        System.out.println("Is introductory course: "
                + subject.isIntroCourse());
        System.out.println("Syllabus: " + subject.syllabusLine());
    }
}   