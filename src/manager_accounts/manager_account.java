package manager_accounts;

import accounts.Account;

import java.util.Scanner;

public class manager_account {
    import java.util.Date;
import java.util.Scanner;

    public class manager_accounts {
        Account[] accounts = new Account[0];
        Scanner scanner = new Scanner(System.in);

        public void show() {
            for (int i = 0; i < accounts.length; i++) {
                System.out.println(accounts[i].toString());
            }
        }

        public Account creatAccount(Account account) {
            System.out.println("Nhập ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập Username: ");
            String username = scanner.nextLine();
            System.out.println("Nhập Passwork: ");
            String passwork = scanner.nextLine();
            System.out.println("Nhập Number phone: ");
            String phone = scanner.nextLine();
            System.out.println("Nhập Date birthday: ");
            String birthday = scanner.nextLine();
            return new Account(id, username, passwork, phone, birthday);
        }

        public void add(Account account) {
            Account[] newArray = new Account[accounts.length + 1];
            for (int i = 0; i < accounts.length; i++) {
                newArray[i] = accounts[i];
            }
            newArray[newArray.length - 1] = account;
            accounts = newArray;
        }

        public int findIndexByName(String name) {
            for (int i = 0; i < accounts.length; i++) {
                if (name.equals(accounts[i].getUsername()))
                    return i;
            }
            return -1;
        }

        public void delete(String name) {}

        }
    }
