import java.io.IOException;
import java.util.Scanner;

class add {
    String[][] ToyzArray;

    public add(String[] ToyzArray[]) {
        this.ToyzArray = ToyzArray;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите 'ID' или 'NAME' игрушки которую хотите добавить: ");
        String name = in.nextLine();
        for (int i = 0; i < ToyzArray.length; i++) {
            if (ToyzArray[i][0] == null) {
                try {
                    Integer.parseInt(name);
                    Scanner in1 = new Scanner(System.in);
                    System.out.print("Игрушки нет! Добавте для нее 'NAME': ");
                    String Nam1e = in1.nextLine();
                    ToyzArray[i][0] = name;
                    ToyzArray[i][1] = Nam1e;

                } catch (NumberFormatException e) {
                    Scanner in2 = new Scanner(System.in);
                    System.out.print("Игрушки нет! Добавте для нее 'ID': ");
                    String ID = in2.nextLine();
                    Integer.parseInt(ID);
                    ToyzArray[i][0] = ID;
                    ToyzArray[i][1] = name;
                } finally {
                    try {
                        Scanner in3 = new Scanner(System.in);
                        System.out.print("Введите количество игрушек (от 1 до 5): ");
                        String kolichestvo = in3.nextLine();
                        int nik = Integer.parseInt(kolichestvo);
                        try {
                            if (nik >= 5) {
                                ToyzArray[i][2] = "5";
                            } else {
                                ToyzArray[i][2] = kolichestvo;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Неккоретное значение");
                            ToyzArray[i][2] = "1";
                        }
                        Scanner in4 = new Scanner(System.in);
                        System.out.print("Введите шанс выпадения (от 1 до 99): ");
                        String chance = in4.nextLine();
                        int chan = Integer.parseInt(chance);
                        try {
                            if (chan >= 99) {
                                ToyzArray[i][3] = "99";
                            } else {
                                ToyzArray[i][3] = chance;
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Неккоретное значение, ваш шанс будет 10");
                            ToyzArray[i][3] = "10";
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } else if (ToyzArray[i][0].equals(name) == true || ToyzArray[i][1].equals(name) == true) {
                System.out.println("Игрушка есть в списке!!");
                Scanner in1 = new Scanner(System.in);
                System.out.print("Введите новое количество игрушек (от 1 до 5): ");
                String kolichestvo = in1.nextLine();
                if (Integer.parseInt(kolichestvo) >= 5) {
                    try {
                        ToyzArray[i][2] = "5";
                    } catch (NumberFormatException e) {
                        System.out.println("Неккоретное значение, будет 1 игрушка");
                        ToyzArray[i][2] = "1";
                    }
                } else {
                    ToyzArray[i][2] = kolichestvo;
                }
                Scanner in2 = new Scanner(System.in);
                System.out.print("Введите новый шанс (от 1 до 99): ");
                String chance = in2.nextLine();
                if (Integer.parseInt(chance) >= 99) {
                    try {
                        ToyzArray[i][3] = "99";
                    } catch (NumberFormatException e) {
                        System.out.println("Неккоретное значение, ваш шанс будет 10");
                        ToyzArray[i][3] = "10";
                    }
                } else {
                    ToyzArray[i][3] = chance;
                }
            }
        }
    }
}
