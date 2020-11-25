package JavaCore_07;

public class Task_02 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();

        Player.info();
        while (Player.countPlayers==6)
        {
            int player = (int) (Math.random()*7);
            switch (player) {
                case 1:
                    player1.run();
                    break;
                case 2:
                    player2.run();
                    break;
                case 3:
                    player3.run();
                    break;
                case 4:
                    player4.run();
                    break;
                case 5:
                    player5.run();
                    break;
                case 6:
                    player6.run();
                    break;
            }
        }
        Player.info();
    }
}
