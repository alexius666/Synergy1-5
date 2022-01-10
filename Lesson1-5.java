import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        boolean ans=false;

        System.out.printf("Число %d: ", a);
        if (a%2==0) System.out.print("чётное,"); else System.out.print("нечётное,");
        if (a==1) System.out.print(" единица(имеет один натуральный делитель)");
        else
            if ((a==2) || (a==3)) ans=true;
        else
            if (a<=1 || a%2==0 || a%3==0) ans = false;
            else {
                for (int i = 5; i * i <= a; i += 6) {
                    if (a%i == 0 || a% (i+2) == 0) ans=false;
                }
                ans=true;
            }

        if (ans) System.out.print(" простое.");
        if (!ans && a!=1) System.out.print(" составное.");
    }

}

