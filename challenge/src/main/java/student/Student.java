package student;

public class Student extends Person {
   private String cne;
   private Major major;

   public Student() {
        super();
        this.cne = "";
        this.major = null;
   }

   public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
        this.major = major;
   }
   public Student(String nom, String prenom, String telephone, String email, String cne) {
            super(nom, prenom, telephone, email);
            this.cne = cne;
            this.major = null;
   }

   // Getters
   public String getCne() { return cne; }
   public Major getMajor() { return major; }

   // Setters
   public void setCne(String Cne) { cne = Cne; }
   public void setMajor(Major m) { major = m; }

   @Override
   public String toString() {
        return 
            "Student : " + getFirstName() + " " +
            getSecondName() + ", with id : " + getId() +
            ", phone number : " + getPhone() +
            ", email : " + getEmail() +
            ", cne : " + cne + ", and enrolled in major : " +
            (major != null ? major.getName() : "None");
   }

   public String getFullNameFormatted() {
        return String.format("%s, %s",
                            getSecondName().toUpperCase(), 
                            getFirstName());
   }
}