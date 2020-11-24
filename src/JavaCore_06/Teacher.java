package JavaCore_06;

public class Teacher {
    private String name;
    private String subject;
    String great="отлично", good="хорошо", satisfactorily = "удовлетворительно", unsatisfactory="неудовлетворительно";
// set
    public void setName(String name){
        this.name = name;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }

    void evaluate(Student student){
        String studentName = student.getName();


        double appraisal = 2 + Math.random()*4;
        switch ((int)appraisal){
            case 2:
                System.out.println("Преподаватель "+name+" оценил студента с именем " +studentName+
                        " по предмету "+subject+" на оценку "+unsatisfactory+".");
                break;
            case 3:
                System.out.println("Преподаватель "+name+" оценил студента с именем " +studentName+
                        " по предмету "+subject+" на оценку "+satisfactorily+".");
                break;
            case 4:
                System.out.println("Преподаватель "+name+" оценил студента с именем " +studentName+
                        " по предмету "+subject+" на оценку "+good+".");
                break;
            case 5:
                System.out.println("Преподаватель "+name+" оценил студента с именем " +studentName+
                        " по предмету "+subject+" на оценку "+great+".");
                break;
        }
    }
}
