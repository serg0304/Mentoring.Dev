package javabase.lesson04;

public class Task1 {
    public static void main(String[] args) {
        String[] strings = {"John", "Bob", "Mary", "Peter", "Sarah"};


        System.out.println();
        System.out.println("for-----------------------------");
        System.out.println();

        for (int i = 0; i < strings.length; i++) {
            String instance = strings[i];

            int letterAmount = instance.length();

                if (letterAmount < 4){
                    System.out.println("Ваше имя короче 4 букв");
                } else if (letterAmount > 4) {
                    System.out.println("Ваше имя длиннее 4 букв");
                } else {
                    System.out.println("Ваше имя состоит из 4 букв");
                }
            }
        System.out.println();
        System.out.println("while-----------------------------");
        System.out.println();

        int i = 0;
        while (i < strings.length){
            String instance = strings[i];
            i++;

            int letterAmount = instance.length();

            if (letterAmount < 4){
                System.out.println("Ваше имя короче 4 букв");
            } else if (letterAmount > 4) {
                System.out.println("Ваше имя длиннее 4 букв");
            } else {
                System.out.println("Ваше имя состоит из 4 букв");
            }
        }

        i=0;

        System.out.println();
        System.out.println("do-while-----------------------------");
        System.out.println();

        do{
            String instance = strings[i];
            i++;

            int letterAmount = instance.length();

            if (letterAmount < 4){
                System.out.println("Ваше имя короче 4 букв");
            } else if (letterAmount > 4) {
                System.out.println("Ваше имя длиннее 4 букв");
            } else {
                System.out.println("Ваше имя состоит из 4 букв");
            }
        } while (i < strings.length);
        }
    }



