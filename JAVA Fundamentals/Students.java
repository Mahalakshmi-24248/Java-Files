public class Students {
    public String name;
    private String id;
    private char section;
    public void read()
    {
        System.out.println("He is Reading");
    }
    private void dance()
    {
        System.out.println("He is Dancing");
    }
    protected void fight()
    {
        System.out.println("He is Fighting");
    }
    public static void main(String[] args) {
        Students student1= new Students();
        student1.name="Hari";
        student1.id="2445";
        student1.section='C';
        student1.read();
        student1.dance();
        student1.fight();
       System.out.println("Student name:"+ student1.name);
       System.out.println("ID:"+ student1.id);
       System.out.println("Section:"+ student1.section);
        Students student2= new Students();
        student2.name="Ram";
        student2.id="2465";
        student2.section='C';
        student2.read();
        student2.dance();
        student2.fight();
       System.out.println("Student name:"+ student2.name);
       System.out.println("ID:"+ student2.id);
       System.out.println("Section:"+ student2.section);
        Students student3= new Students();
        student3.name="Krish";
        student3.id="2455";
        student3.section='C';
        student3.read();
        student3.dance();
        student3.fight();
       System.out.println("Student name:"+ student3.name);
       System.out.println("ID:"+ student3.id);
       System.out.print("Section:"+ student3.section);
    }
}