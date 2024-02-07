import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class add {
    private static final int Null = 0;
    String[][] ToyzArray;

    public add(String[] ToyzArray[]) {
        this.ToyzArray = ToyzArray;

        for (int i = 0; i < ToyzArray.length; i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите ID или название игрушки которую хотите добавить: ");
            String name = in.nextLine();
            if (ToyzArray[i][0] == "Null") {
                int Nul = i;
                break;
            }
            if (ToyzArray[i][0] == name || ToyzArray[i][1] == name) {
                int sis = i;
                System.out.println("Игрушка есть в списке");
                if (ToyzArray[i][2] == "5") {
                    break;
                } else {
                    Scanner in1 = new Scanner(System.in);
                    System.out.print("количество которое будет в розыгрыше (до 5шт в розыгрыше): ");
                    String kolichestvo = in1.nextLine();
                    int x = 0;
                    while (x == 0) {
                        if (Integer.parseInt(kolichestvo) >= 5) {
                            try {
                                ToyzArray[i][2] = "5";
                                x = 1;
                            } catch (NumberFormatException e) {
                                System.out.println("Неккоретное значение");
                            }
                        } else {
                            x = 1;
                            ToyzArray[i][3] = kolichestvo;
                        }
                    }
                }
            }

            else {
                try {
                    int id = Integer.parseInt(name);
                    Scanner in1 = new Scanner(System.in);
                    System.out.print("игркущкп нет добавте ждч нее имя: ");
                    String Nam1e = in1.nextLine();
                    ToyzArray[i][0] = name;
                    ToyzArray[i][1] = Nam1e;

                } catch (NumberFormatException e) {
                    Scanner in1 = new Scanner(System.in);
                    System.out.print("игркущкп нет добавте ждч нее ID: ");
                    String ID = in1.nextLine();
                    ToyzArray[i][0] = ID;
                    ToyzArray[i][1] = name;
                } finally {
                    Scanner in1 = new Scanner(System.in);
                    System.out.print("введите количество: ");
                    String kolichestvo = in1.nextLine();
                    if (Integer.parseInt(kolichestvo) >= 5) {
                        try {
                            ToyzArray[i][2] = "5";
                        } catch (NumberFormatException e) {
                            System.out.println("Неккоретное значение");
                            ToyzArray[i][2] = "1";
                        }
                    } else {
                        ToyzArray[i][2] = kolichestvo;
                    }

                    Scanner in2 = new Scanner(System.in);
                    System.out.print("введите шанс выпаления от 1 до 99%: ");
                    String chance = in2.nextLine();
                    ToyzArray[i][3] = chance;
                    if (Integer.parseInt(chance) >= 99) {
                        try {
                            ToyzArray[i][3] = "99";
                        } catch (NumberFormatException e) {
                            System.out.println("Неккоретное значение");
                            ToyzArray[i][3] = "10";
                        }
                    } else {
                        ToyzArray[i][3] = chance;

                    }

                }
                break;

            }
            break;
        }
    }
}

// я ввожу данные, id он ищет если не находит то добвляет

// id
// name
// kolichestvo
// chance
