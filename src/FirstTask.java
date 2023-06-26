import java.util.Scanner;

/*
Дано четное число N (>0) и символы a и b.
Написать метод, который вернет строку длины N,
которая состоит из чередующихся символов a и b, начиная с a.
 */
public class FirstTask {
    int n;
    char a;
    char b;
    int count = 0;

    FirstTask() {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = in.next().charAt(0);
        b = in.next().charAt(0);
        in.close();
    }

    FirstTask(int n, char a, char b) {
        this.n = n;
        this.a = a;
        this.b = b;
    }

    FirstTask(int n) {
        this.n = n;
        Scanner in = new Scanner(System.in);
        a = in.next().charAt(0);
        b = in.next().charAt(0);
        in.close();
    }

    public boolean isOdd(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            System.out.println("Введеное число n - нечетное");
            return false;
        }
    }

    public String getResult() {
        StringBuilder result = new StringBuilder();
        if (isOdd(n)) {
            while (n != count) {
                result.append(a).append(b);
                count = count + 2;
            }
        }
        return result.toString();
    }
}
