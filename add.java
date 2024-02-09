import java.io.IOException;
import java.util.Scanner;

class add {
    String[][] ToyzArray;

    public add(String[] ToyzArray[]) {
        this.ToyzArray = ToyzArray;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ID или название игрушки которую хотите добавить: ");
        String name = in.nextLine();
        for (int i = 0; i < ToyzArray.length; i++) {
            if (ToyzArray[i][0] == null) {
                try {
                    Integer.parseInt(name);
                    Scanner in1 = new Scanner(System.in);
                    System.out.print("игрушки нет добавте для нее имя: ");
                    String Nam1e = in1.nextLine();
                    ToyzArray[i][0] = name;
                    ToyzArray[i][1] = Nam1e;

                } catch (NumberFormatException e) {
                    Scanner in2 = new Scanner(System.in);
                    System.out.print("игркушки нет добавте для нее ID: ");
                    String ID = in2.nextLine();
                    Integer.parseInt(ID);
                    ToyzArray[i][0] = ID;
                    ToyzArray[i][1] = name;
                } finally {
                    try {
                        Scanner in3 = new Scanner(System.in);
                        System.out.print("введите количество игрушек: ");
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
                        System.out.print("введите шанс выпадения: ");
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
                            System.out.println("Неккоретное значение");
                            ToyzArray[i][3] = "10";
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }

                }
            } else if (ToyzArray[i][0].equals(name) == true || ToyzArray[i][1].equals(name) == true) {
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
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Неккоретное значение");
                            }
                        } else {
                            x = 1;
                            ToyzArray[i][2] = kolichestvo;
                        }

                    }
                }
                break;

            }
        }

    }

}

// я ввожу данные, id он ищет если не находит то добвляет

// id
// name
// kolichestvo
// chance
