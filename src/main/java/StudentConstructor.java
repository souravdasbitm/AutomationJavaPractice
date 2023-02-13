public class StudentConstructor {
    String name;
    int id;

    StudentConstructor(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display(){
        System.out.println("ID: "+id+" Name: "+name);
    }
}
