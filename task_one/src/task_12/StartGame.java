package task_12;

public class StartGame {
    public static void main(String[] args){

        Character player1 = new Knight("Lancelot", 98,2,5);
        Character player2 = new Demon("Misrael",30, 2, 10);
        GameProcess roundOne = new GameProcess(player1, player2);
        roundOne.fight();

        Character player3 = new Demon("Morgot",89,2,1);
        Character player4 = new Knight("Artur", 94,2,5);
        GameProcess roundTwo = new GameProcess(player3, player4);
        roundTwo.fight();

        Character player5 = new Knight("Dobrynya Nikitich", 25,3,5);
        Character player6 = new Demon("Solovey Razbojnik",30, 2, 10);
        GameProcess roundTree = new GameProcess(player5, player6);
        roundTree.fight();
    }
}
