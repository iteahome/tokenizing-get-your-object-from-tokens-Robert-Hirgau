public class Main {

    public static void main(String[] args) {
        Student oldStudent = new Student(1,"Andrei", "Mladin","Cluj-Napoca","romana", 10);
        String studentString = oldStudent.toString();
        System.out.println("The old student is :");
        System.out.println(studentString);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        String[] tokens = studentString.split (",");
        System.out.println("Print tokens:");
        System.out.println("id: " + tokens[0]);
        System.out.println("first name : "+ tokens[1]);
        System.out.println("last name: " + tokens[2]);
        System.out.println("city: "+ tokens[3]);
        System.out.println("language: "+ tokens[4]);
        System.out.println("grade: "+tokens[5]);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        Student newStudent = new Student((Integer.parseInt(tokens[0])),tokens[1],tokens[2],tokens[3],tokens[4],Integer.parseInt(tokens[5]));
        System.out.println("The new student from tokens is :");
        System.out.println(newStudent.toString());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

}