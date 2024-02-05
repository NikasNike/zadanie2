import java.util.Scanner;

class main {
    public static void main(String[] args) {
        int[][] ToyzArray = new int[10][];
        String command = "null";
        while (command == "null") {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите команду или info: ");
            String name = in.nextLine();
            switch (name) {
                case ("info"):
                    System.out.println("info, read, add, play, exit");
                    break;
                case ("read"):

                    break;
                case ("add"):

                    break;

                case ("play"):

                    break;
                case ("exit"):
                    System.out.println("Вы вышли");
                    break;
                default:
                    System.out.println("неверная команда");
                    ;
                    break;
            }
        }
    }
}