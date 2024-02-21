     import java.util.Scanner;

     class Account {
         String custName;
         long accNum;
         String accType;
         double balance;

         public Account(String custName, long accNum, String accType, double balance) {
             this.custName = custName;
             this.accNum = accNum;
             this.accType = accType;
             this.balance = balance;
         }

         public void deposit(double amount) {
             balance += amount;
             System.out.println("Deposit successful. New balance: " + balance);
         }

         public void displayBalance() {
             System.out.println("Balance: " + balance);
         }
     }

     class CurAccount extends Account {
         double minBalance;
         double serviceCharge;

         public CurAccount(String custName, long accNum, String accType, double balance, double minBalance, double serviceCharge) {
             super(custName, accNum, accType, balance);
             this.minBalance = minBalance;
             this.serviceCharge = serviceCharge;
         }

         @Override
         public void deposit(double amount) {
             super.deposit(amount);
         }

         @Override
         public void displayBalance() {
             super.displayBalance();
         }

         public void withdraw(double amount) {
             if (balance - amount >= minBalance) {
                 balance -= amount;
                 System.out.println("Withdrawal successful. New balance: " + balance);
             } else {
                 System.out.println("Insufficient funds. Withdrawal failed.");
             }
         }
     
         public void imposeServiceCharge() {
             balance -= serviceCharge;
             System.out.println("Service charge imposed. New balance: " + balance);
         }
     }

     class SavAccount extends Account {
         double interestRate;
     
         public SavAccount(String custName, long accNum, String accType, double balance, double interestRate) {
             super(custName, accNum, accType, balance);
             this.interestRate = interestRate;
         }

         @Override
         public void deposit(double amount) {
             super.deposit(amount);
         }

         @Override
         public void displayBalance() {
             super.displayBalance();
         }

         public void computeAndDepositInterest() {
             double interest = balance * interestRate / 100;
             balance += interest;
             System.out.println("Interest computed and deposited. New balance: " + balance);
         }

         public void withdraw(double amount) {
             if (balance - amount >= 0) {
                 balance -= amount;
                 System.out.println("Withdrawal successful. New balance: " + balance);
             } else {
                 System.out.println("Insufficient funds. Withdrawal failed.");
             }
         }
     }

     public class Bank {
         public static void main(String[] args) {
             Scanner s = new Scanner(System.in);

             CurAccount currentAccount = new CurAccount("Avni Khanna", 123456789, "Current", 1000, 500, 10);
             SavAccount savingsAccount = new SavAccount("Neil Khanna", 987654321, "Savings", 5000, 5);

             System.out.println("1. Current Account");
             System.out.println("2. Savings Account");
             System.out.print("Select account type: ");
             int choice = s.nextInt();

             switch (choice) {
                 case 1:
                     System.out.println("Current Account selected.");
                     operateCurrentAccount(currentAccount, s);
                     break;
                 case 2:
                     System.out.println("Savings Account selected.");
                     operateSavingsAccount(savingsAccount, s);
                     break;
                 default:
                     System.out.println("Invalid choice.");
             }
         }

         public static void operateCurrentAccount(CurAccount currentAccount, Scanner s) {
             int option;

             do {
                 System.out.println("\n1. Deposit");
                 System.out.println("2. Withdraw");
                 System.out.println("3. Display Balance");
                 System.out.println("4. Exit");
                 System.out.print("Select option: ");
                 option = s.nextInt();

                 switch (option) {
                     case 1:
                         System.out.print("Enter deposit amount: ");
                         double depositAmount = s.nextDouble();
                         currentAccount.deposit(depositAmount);
                         break;
                     case 2:
                         System.out.print("Enter withdrawal amount: ");
                         double withdrawAmount = s.nextDouble();
                       currentAccount.withdraw(withdrawAmount);
                         if (currentAccount.balance < currentAccount.minBalance) {
                             currentAccount.imposeServiceCharge();
                         }
                         break;
                     case 3:
                         currentAccount.displayBalance();
                         break;
                     case 4:
                         System.out.println("Exiting current account operations.");
                         break;
                     default:
                         System.out.println("Invalid option.");
                 }
             } while (option != 4);
         }

         public static void operateSavingsAccount(SavAccount savingsAccount, Scanner s) {
             int option;
     
             do {
                 System.out.println("\n1. Deposit");
                 System.out.println("2. Withdraw");
                 System.out.println("3. Display Balance");
                 System.out.println("4. Compute and Deposit Interest");
                 System.out.println("5. Exit");
                 System.out.print("Select option: ");
                 option = s.nextInt();

                 switch (option) {
                     case 1:
                         System.out.print("Enter deposit amount: ");
                         double depositAmt = s.nextDouble();
                         savingsAccount.deposit(depositAmt);
                         break;
                     case 2:
                         System.out.print("Enter withdrawal amount: ");
                         double withdrawAmt = s.nextDouble();
                         savingsAccount.withdraw(withdrawAmt);
                         break;
                     case 3:
                         savingsAccount.displayBalance();
                         break;
                     case 4:
                         savingsAccount.computeAndDepositInterest();
                         break;
                     case 5:
                         System.out.println("Exiting savings account operations.");
                         break;
                     default:
                         System.out.println("Invalid option.");
                 }
             } while (option != 5);
         }
     }
