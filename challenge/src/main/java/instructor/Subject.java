package instructor;

public class Subject extends Instructor{
    private int id;
    private String code;
    private String title;

    public Subject(String secondName, String firstName,
                    String phone, String email, String employeeNumber,
                    int id, String code, String title) {
                        
        super(id, secondName, firstName, phone, email, employeeNumber);
        this.code = code;
        this.title = title;
    }

    public String normalizedCode() {
        char c = ' ';
        code.replace(String.valueOf(c), "");
        return code.toUpperCase();
    }

    public String properTitle() {
        boolean capitalize = true;

        for(int i=0; i<title.length(); i++) {

            char c = title.charAt(i);

            if (capitalize) {
                c = Character.toUpperCase(c);
                capitalize = false;
            }
            if (c == ' ') {
                capitalize = true;
            }
        }

        return title;
    }

    public boolean isIntroCourse() {
        String target = "intro";
        return code.toLowerCase().contains(target) || 
                        title.toLowerCase().contains(target);
    }

    public String syllabusLine() {
        StringBuilder sb = new StringBuilder();

        sb.append(code + '-' + title);
        sb.append("(Instructor : " + secondName +' ' + firstName + ')');

        return sb.toString();
    }
}
