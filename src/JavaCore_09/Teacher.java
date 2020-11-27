package JavaCore_09;

public class Teacher extends Human{
    private String itemName;

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public Teacher(String itemName, Human human2){
        this.itemName=itemName;
    }
    public void printInfo(Human human2){
        String name = human2.getName();
        super.printInfo(name);
        System.out.println("Этот преподаватель с именем "+ name);
    }
}
