public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String city;
    private String nativeLanguage;
    private int grade;

   public Student(int id,String firstName,String lastName,String city,String nativeLanguage,int grade){
       this.id = id;
       this.firstName = firstName;
       this.lastName = lastName;
       this.city = city;
       this.nativeLanguage = nativeLanguage;
       this.grade = grade;
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
   }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
       this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCity() {
       return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getNativeLanguage() {
       return nativeLanguage;
    }
    public void setNativeLanguage(String nativeLanguage) {
       this.nativeLanguage = nativeLanguage;
    }
    public int getGrade() {
       return grade;
    }
    public void setGrade(int grade) {
       this.grade = grade;
    }

    @Override
    public String toString() {
       return id + "," + firstName + "," + lastName + "," + city + "," + nativeLanguage + "," + grade;
    }
}



