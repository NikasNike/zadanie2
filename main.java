import java.util.Scanner;

class main {
    public static void main(String[] args) {
        String[][] ToyzArray = new String[10][4];
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
                    for (int i = 0; i < 10; i++) { // идём по строкам
                        for (int j = 0; j < 4; j++) {// идём по столбцам
                            switch (j) {
                                case 0:
                                    System.out.print("ID: " + ToyzArray[i][j] + "- "); // вывод элемента
                                    break;
                                case 1:
                                    System.out.print("Name: " + ToyzArray[i][j] + "- ");
                                    break;
                                case 2:
                                    System.out.print("Chance: " + ToyzArray[i][j] + "- ");
                                    break;
                                case 3:
                                    System.out.print("Количество: " + ToyzArray[i][j] + "");
                                    break;
                                default:
                                    break;
                            }
                        }
                        System.out.println();// перенос строки ради визуального сохранения табличной формы
                    }
                    break;
                case ("add"):
                    add add = new add(ToyzArray);
                    String i1 = in.nextLine();
                    for (int i = 0; i < ToyzArray.length - 1; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(ToyzArray[i][j]);
                        }
                        System.out.println();
                    }
                    break;

                case ("play"):

                    break;
                case ("exit"):
                    System.out.println("Вы вышли");
                    command = "nul";
                    break;
                default:
                    System.out.println("неверная команда");
                    ;
                    break;
            }
        }
    }
}