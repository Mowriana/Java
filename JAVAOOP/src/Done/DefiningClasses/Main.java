package DefiningClasses;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    private static HashMap<Integer, BankAccount> accounts = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while (! "End".equals(input = reader.readLine())) {
            String[] cmdArgs = input.split("\\s+");

            String cmdType = cmdArgs[0];
            switch (cmdType) {
                case "Create":
                    execCreate();
                    break;
                case "Deposit":
                    execDeposit(cmdArgs);
                    break;
                case "SetInterest":
                    BankAccount.setInterestRate(Double.valueOf(cmdArgs[1]));
                    break;
                case "GetInterest":
                    execGetInterest(cmdArgs);
                    break;
            }
        }
    }

    private static void execCreate() {
        BankAccount account = new BankAccount();
        accounts.put(account.getId(), account);
        System.out.printf("Account %s created%n", account);
    }

    private static void execGetInterest(String[] cmdArgs) {
        int id = Integer.valueOf(cmdArgs[1]);

        if (accounts.containsKey(id)) {
            int years = Integer.valueOf(cmdArgs[2]);
            System.out.printf("%.2f%n", accounts.get(id).getInterestRate(years));
        } else {
            System.out.println("Account does not exist");
        }
    }

    private static void execDeposit(String[] cmdArgs) {
        int id = Integer.valueOf(cmdArgs[1]);

        if (accounts.containsKey(id)) {
            double amount = Double.valueOf(cmdArgs[2]);
            accounts.get(id).deposit(amount);
            System.out.printf("Deposited %.0f to %s%n", amount, accounts.get(id));
        } else {
            System.out.println("Account does not exist");
        }
    }
}