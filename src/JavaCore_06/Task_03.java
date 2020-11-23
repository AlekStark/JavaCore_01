package JavaCore_06;

public class Task_03 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();
        student.setName("Петров");

        teacher.setName("Иванов");
        teacher.setSubject("История");
        teacher.evaluate(student.getName());
    }
}
