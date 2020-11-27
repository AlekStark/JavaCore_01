package JavaCore_09;

class Human {
    private String name;

    public Human(){
    }
    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public void printInfo(String name){
        System.out.println("Этот человек с именем "+ name);
    }
}
