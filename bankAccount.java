import java.util.Scanner;

class Account {
    private String accNo, name, address, phno, dob;
    protected long balance;

    public Account(String acc, String n, String add, String phno, String dob) {
        accNo = acc;
        name = n;
        address = add;
        this.phno = phno;
        this.dob = dob;
        balance = 0;
    }

    public String getAccNo() { return accNo; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhno() { return phno; }
    public String getDOB() { return dob; }
    public long getBalance() { return balance; }

    public void setAddress(String add) { address = add; }
    public void setPhno(String phno) { this.phno = phno; }
}

class SavingsAccount extends Account {
    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void deposit(long amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    public void withdraw(long amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class LoanAccount extends Account {
    public LoanAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void payEMI(long amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("EMI Paid: " + amt);
        } else {
            System.out.println("EMI exceeds loan balance!");
        }
    }

    public void repay(long amt) {
        if (amt == balance) {
            balance = 0;
            System.out.println("Loan fully repaid!");
        } else {
            System.out.println("Amount does not match loan balance.");
        }
    }
}

public class SCInherit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Savings Account
        System.out.println("Enter Savings Account Details:");
        System.out.print("Account No: ");
        String saAccNo = sc.nextLine();
        System.out.print("Name: ");
        String saName = sc.nextLine();
        System.out.print("Address: ");
        String saAddress = sc.nextLine();
        System.out.print("Phone: ");
        String saPhno = sc.nextLine();
        System.out.print("DOB: ");
        String saDOB = sc.nextLine();

        SavingsAccount sa = new SavingsAccount(saAccNo, saName, saAddress, saPhno, saDOB);

        // Create Loan Account
        System.out.println("\nEnter Loan Account Details:");
        System.out.print("Account No: ");
        String laAccNo = sc.nextLine();
        System.out.print("Name: ");
        String laName = sc.nextLine();
        System.out.print("Address: ");
        String laAddress = sc.nextLine();
        System.out.print("Phone: ");
        String laPhno = sc.nextLine();
        System.out.print("DOB: ");
        String laDOB = sc.nextLine();

        LoanAccount la = new LoanAccount(laAccNo, laName, laAddress, laPhno, laDOB);

        // Menu-driven operations
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Deposit in Savings Account");
            System.out.println("2. Withdraw from Savings Account");
            System.out.println("3. View Savings Account Balance");
            System.out.println("4. Update Savings Account Address/Phone");
            System.out.println("5. Pay Loan EMI");
            System.out.println("6. Repay Loan Fully");
            System.out.println("7. View Loan Balance");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    sa.deposit(sc.nextLong());
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    sa.withdraw(sc.nextLong());
                    break;
                case 3:
                    System.out.println("Savings Balance: " + sa.getBalance());
                    break;
                case 4:
                    sc.nextLine(); // consume newline
                    System.out.print("Enter new address: ");
                    sa.setAddress(sc.nextLine());
                    System.out.print("Enter new phone: ");
                    sa.setPhno(sc.nextLine());
                    System.out.println("Address and Phone updated.");
                    break;
                case 5:
                    System.out.print("Enter EMI amount: ");
                    la.payEMI(sc.nextLong());
                    break;
                case 6:
                    System.out.print("Enter amount to repay loan fully: ");
                    la.repay(sc.nextLong());
                    break;
                case 7:
                    System.out.println("Loan Balance: " + la.getBalance());
                    break;
                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
