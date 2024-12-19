import java.util.Scanner;

class java1 {
    public static void main(String []args) {
        Scanner z = new Scanner(System.in);
        System.out.println("masukan a-d ");
        String score = z.nextLine();
        switch (score) {
            case "a" : System.out.println("excelent");
            break;
            case "b" : System.out.println("Good");
            break;
            case "c" : System.out.println("Great");
            break;
            case "d" : System.out.println("Bad");
        }
    }
}