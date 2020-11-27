package JavaCore_09;

public class Student extends Human{
    private String studyGroup;

    public void setStudyGroup(String studyGroup){
        this.studyGroup=studyGroup;
    }

    public String getStudyGroup() {
        return studyGroup;
    }

    public Student(String studyGroup,Human human1){
        this.studyGroup=studyGroup;

    }
    public void printInfo(Human human1){
        String name = human1.getName();
        super.printInfo(name);
        System.out.println("Этот студент с именем "+ name);
    }
}
