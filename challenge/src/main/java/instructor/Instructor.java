package instructor;


public class Instructor extends student.Person {
    private String employeeNumber;

    public Instructor(int id, String secondName, String firstName, String phone, String email, String employeeNumber) {

        super(secondName, firstName, phone, email);
        this.employeeNumber = employeeNumber;
    }

    public String cleanEmployeeNumber() {
        char c = ' ';
        employeeNumber.replace(String.valueOf(c), "");
        return employeeNumber;
    }

    public String summaryLine() {
        return String.format(
            "Instructor[employeeNumber=%s, lastName=%s, firstName=%s]", 
            employeeNumber, 
            secondName, 
            firstName
        );
    }

    public String toCard() {
        StringBuilder sb = new StringBuilder();

        sb.append("Instructor");
        sb.append("\n----------");
        sb.append("\nEmployee # :" + employeeNumber);
        sb.append("\nName :" + secondName + ", " + firstName);
        sb.append("\nEmail :" + email);
        sb.append("\nPhone :" + phone);

        return sb.toString();
    }

    public String displayName() {
        StringBuilder sb = new StringBuilder();

        if (firstName == null)
            if (secondName == null) {
                return null;
            } else {
                sb.append(secondName);
            }
        
        if (secondName == null) {
            sb.append(firstName);
        }

        return sb.toString();
    }
}
