package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;

    public Person() { this.id = nextId++; }

    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.secondName = secondName;
        this.phone = telephone;
        this.email = email;
    }

    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getSecondName() { return secondName; }
    public String getPhone() { return phone; } 
    public String getEmail() { return email; }

    public void setId(int Id) { id = Id; }
    public void setFirstName(String FirstName) { firstName = FirstName; }
    public void setSecondName(String SecondName) { secondName = SecondName; }
    public void setPhone(String Phone) { phone = Phone; }
    public void setEmail(String Email) { email = Email; }

    @Override 
    public String toString() {
        return 
            "Person : " + firstName + " " +
            secondName + ", with id : " + id +
            ", phone number : " + phone +
            ", and email : " + email;
    }
}

