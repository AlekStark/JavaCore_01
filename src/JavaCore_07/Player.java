package JavaCore_07;

public class Player {
    private int stamina;

    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;

    public static int countPlayers;

    public Player() {
         stamina = (int)( Math.random() * (100-90) ) + 90;
         if(countPlayers<6)
             countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }
    public void run(){
        if(stamina==1){
            this.stamina--;
            countPlayers--;
            return;}
        else {
            this.stamina--;
            }
        }
    public  static void info(){
        if(countPlayers<6){
            System.out.println("Команды неполные. На поле еще есть " + (6-countPlayers)+ " свободных мест");
        }
        else {
            System.out.println("На поле нет свободных мест");
        }
    }

}
