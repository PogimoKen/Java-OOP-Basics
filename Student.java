public class  Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayinfo(){
        System.out.println("Student Name: " + name);
        System.out.println("ID: " + id);
    }
}



