import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class noks {
    String[][] ToyzArray;

    public noks(String[] ToyzArray[]) {
        this.ToyzArray = ToyzArray;
        Scanner in = new Scanner(System.in);
        System.out.print("Угадайте число от 0 до 1 что бы выйграть игрушку: ");
        int num = in.nextInt();
        int x = 0;
        while (x == 0) {
            if (num == 0 || num == 1) {
                int rand = (int) (Math.random() * 2);
                if (rand == num) {
                    x = 1;
                    System.out.print("Правильный ответ! ");
                    System.out.print("");
                    ///////////////////////////////
                    int y = 0;
                    int[] mass = new int[10];
                    int rand1 = (int) (Math.random() * 99);
                    // System.out.println(rand1 + "вывод рандома");
                    for (int i = 0; i < ToyzArray.length; i++) {
                        if (ToyzArray[i][3] != null) {
                            if (Integer.parseInt(ToyzArray[i][3]) <= rand1 + 5
                                    && Integer.parseInt(ToyzArray[i][3]) >= rand1 - 5) {
                                mass[y] = i;
                                y++;
                            }
                        }
                    }
                    if (y == 0) {
                        System.out.println("Увы, Вы ничего не выйграли :(");
                        break;
                    } else {
                        int rand2 = (int) (Math.random() * y);
                        int g = Integer.parseInt(ToyzArray[y - 1][2]);
                        if (g - 1 == 0) {
                            System.out.println("Вы выйграли: " + ToyzArray[y][1]);
                            modify(ToyzArray[y][1]);
                            for (int i1 = 0; i1 < 4; i1++) {
                                ToyzArray[y][i1] = null;

                            }
                        } else {
                            int sum = Integer.parseInt(ToyzArray[y][2]) - 1;
                            String sim = Integer.toString(sum);
                            ToyzArray[y][2] = sim;
                            System.out.println("Вы выйграли: " + ToyzArray[y][1]);
                            modify(ToyzArray[y][1]);
                        }

                    }

                    //////////////////////////// можно выбрать самому игрушку из списка
                    // for (int i = 0; i < ToyzArray.length; i++) {
                    // if (ToyzArray[i][2] == null) {
                    // } else {
                    // System.out.print("\n Номер: " + i + " NAME: " + ToyzArray[i][1]);
                    // System.out.print("\n");
                    // }
                    // }
                    // Scanner in1 = new Scanner(System.in);
                    // System.out.println("Введите номер: ");
                    // int nimber = in1.nextInt();
                    // String naiming = ToyzArray[nimber][1];
                    // if (Integer.parseInt(ToyzArray[nimber][2]) - 1 == 0) {
                    // for (int i1 = 0; i1 < 4; i1++) {
                    // ToyzArray[nimber][i1] = null;
                    // }
                    // } else {
                    // int sum = Integer.parseInt(ToyzArray[nimber][2]) - 1;
                    // String sim = Integer.toString(sum);
                    // ToyzArray[nimber][2] = sim;
                    // ////////////////////////////////////////////////////////////

                }
            }

        }
    }

    public static void modify(String naiming) {
        try (FileWriter writer = new FileWriter("priz.txt", true)) {
            String text = naiming;
            writer.append(text);
            writer.append("\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}