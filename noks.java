import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class noks {
    String[][] ToyzArray;

    public noks(String[] ToyzArray[]) {
        this.ToyzArray = ToyzArray;
        // розыгрыш игрушек
        Scanner in = new Scanner(System.in);
        System.out.print("Угадайте число от 0 до 1 что бы выйграть игрушку: ");
        int num = in.nextInt();
        int x = 0;
        // public static String naiming;
        while (x == 0) {
            if (num == 0 || num == 1) {
                int rand = (int) (Math.random() * 2);
                System.out.println(rand);
                if (rand == num) {
                    x = 1;
                    System.out.print("Ура вы угадали, выберите из списка номер понравившейся игрушки: ");
                    for (int i = 0; i < ToyzArray.length; i++) {
                        if (ToyzArray[i][2] == null) {

                        } else {
                            System.out.print("\n Номер: " + i + "  NAME: " + ToyzArray[i][1]);
                            System.out.print("\n");
                        }
                    }
                    Scanner in1 = new Scanner(System.in);
                    System.out.println("Введите номер: ");
                    int nimber = in1.nextInt();
                    String naiming = ToyzArray[nimber][1];
                    if (Integer.parseInt(ToyzArray[nimber][2]) - 1 == 0) {
                        for (int i1 = 0; i1 < 4; i1++) {
                            ToyzArray[nimber][i1] = null;
                        }
                    } else {
                        int sum = Integer.parseInt(ToyzArray[nimber][2]) - 1;
                        String sim = Integer.toString(sum);
                        ToyzArray[nimber][2] = sim;

                    }
                    modify(naiming);
                }

                else {
                    System.out.println("Попробуйте еще раз");
                }
            } else {
                System.out.println("введено не коректное занчение");
            }

        }
    }

    public static void modify(String naiming) {
        try (FileWriter writer = new FileWriter("priz.txt", true)) {

            // запись всей строки
            String text = naiming;
            writer.append(text);
            writer.append("\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

// метод получения ее(удаляем из массива и пишем в текст какие игрушки выбили)
// добавление в текст
// добавляет в 1 строку