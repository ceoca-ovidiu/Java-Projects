public class TestClass {
    public static void main(String[] args) {
        int counter = 0;
        int size = 130;
        if (size % 2 == 0) {
            plusLines(size);
            counter = upperPart(size, counter);
            middlePart(size, '-', counter);
            counter -= 2;
            counter = lowerPart(size, counter);
            plusLines(size);
        } else if (size == 1) {
            plusLines(size);
            System.out.println("|<>|");
            plusLines(size);
        } else {
            plusLines(size);
           counter =  upperPart(size, counter);
            middlePart(size, '=', counter);
            counter -= 2;
            counter = lowerPart(size, counter);
            plusLines(size);
        }
    }


    // TODO -- add any helper methods here
    public static void plusLines(int size) {

        System.out.print("+");
        for (int i = 0; i < 2 * size; i++) {
            System.out.print("-");
        }
        System.out.print("+\n");

    }

    public static void middlePart(int size, char sign, int counter) {

        System.out.print("|<");
        for (int i = 0; i < counter; i++) {
            System.out.print(sign);
        }
        System.out.print(">|\n");
    }

    public static int upperPart(int size, int counter) {

        for (int i = 0; i < size - 1; i++) { // pentru linii sus
            System.out.print("|");

            for (int j = 0; j <= size - i - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 0; j < counter; j++) {
                if (i % 2 == 0) {
                    System.out.print("=");
                } else {
                    System.out.print("-");
                }
            }
            System.out.print("\\");
            for (int j = 0; j <= size - i - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
            counter += 2;
        }
        return counter;

    }

    public static int lowerPart(int size, int counter) {

        for (int i = size - 1; i > 0; i--) { // pentru linii jos
            System.out.print("|");

            for (int j = size - i - 1; j >= 0; j--) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int j = counter; j > 0; j--) {
                if (i % 2 == 0) {
                    System.out.print("-");
                } else {
                    System.out.print("=");
                }
            }
            System.out.print("/");
            for (int j = size - i - 1; j >= 0; j--) {
                System.out.print(" ");
            }
            System.out.println("|");
            counter -= 2;
        }
    return counter;
    }

}

