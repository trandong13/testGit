import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class Main {


    public static int binhPhuong(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
         Nguoi a = new Nguoi("dong",13,"bac ninh");
        System.out.println("thong tin nguoi \n"+a);
        book s = new book("12333","cong nghe java",a,123,2);

        System.out.println("thong tin sach:\n"+s);
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }
}