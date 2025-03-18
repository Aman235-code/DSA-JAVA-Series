public class VariableDatatype {

    public static void printMessage(String message){
        System.out.println(message);
    }
    public static void main(String[] args) {
        // printMessage("DSA Tutorial Yt");
        // int x = 50;
        // double marks = 98.56;
        // System.out.println(x);
        // System.out.println(marks);

        // Student s1 = new Student();
        // s1.name = "Aman";
        // s1.phone = "539393";
        // s1.rollNo = 6696L;
        // s1.city = "Delhi";

        Student student1 = new Student("Aman@gmail","Aman",1234);
        // Student student2 = new Student("Ayush@gmail","Ayush",5678);
        // student1.name = "Aman";
        // student1.phone = "539393";
        // student1.rollNo = 6696L;
        // student1.city = "Delhi";



        // System.out.println(student1.name); 
        // student1.showAll();
        student1.showName("Ahmed");
        student1.showName();
        // student2.showAll();
    }
}

