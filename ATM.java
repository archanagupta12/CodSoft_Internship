import java.util.Scanner;

    public class ATM {
        private int bal = 100000;
    
        public void withdraw(int amount) {
            if (bal >= amount) {
                bal -= amount;
                System.out.println("Please collect your money.");
            } else {
                System.out.println("Less balance.");
            }
        }
    
        public void deposit(int amount) {
            bal += amount;
            System.out.println("Your money successfully deposited.");
        }
    
        public void checkBalance() {
            System.out.println("Balance: " + bal);
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ATM atm = new ATM();
    
            while (true) {
                System.out.println("Automated Teller Machine");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Choose the operation you want to perform: ");
    
                int x= sc.nextInt();
                switch (x) {
                    case 1:
                        System.out.print("Enter amount to be withdrawn: ");
                        int withdrawAmount = sc.nextInt();
                        atm.withdraw(withdrawAmount);
                        break;
                    case 2:
                        System.out.print("Enter amount to be deposited: ");
                        int depositAmount = sc.nextInt();
                        atm.deposit(depositAmount);
                        break;
                    case 3:
                        atm.checkBalance();
                        break;
                        
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }
     

