import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static manager_account managerAccount = new manager_account();
    public static void main(String[] args) {
        System.out.println("1. Hiểm thị");
        System.out.println("2. Thêm");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                managerAccount.show();
                break;
            case 2:
                managerAccount.add(managerAccount.creatAccount(new Account()));
                break;

        }
    }
}