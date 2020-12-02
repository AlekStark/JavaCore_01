package JavaCore_11;

public class Warehouse {
    private int countOrder = 0;
    private int balance = 0;

    @Override
    public String toString() {
        return "Склад { " +
                "Количество аказов = " + countOrder +
                ", Доход склада = " + balance +
                '}';
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public void doWork(){
        //this.countOrder++;
    }
    public void bonus(){

    }

}
