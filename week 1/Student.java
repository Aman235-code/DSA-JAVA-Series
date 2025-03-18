public class Student {

    int id;

    String name;

    String phone;

    long rollNo;

    String city;

    String email;

    public Student(String email, String name, int id){
        this.email = email;
        this.name = name;
        this.id = id;
        System.out.println("Student obj created");
    }

    public  Student(){

    }

    public void showName(){
        System.out.println("Name: "+name);
    } 

    public  void showName(String lastname){
        System.out.println(name +" " +lastname);
    }

    public void showAll(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(phone);
        System.out.println(rollNo);
        System.out.println(city);
        System.out.println(email);
    }

}
