package Internship_Project;

	import java.util.Scanner;

	public class ATM {
		float Balance;
		int PIN = 2001;

		public void checkpin() {
			System.out.println("Enter your pin:");
			Scanner sc = new Scanner(System.in);
			int enteredpin = sc.nextInt();
			if (enteredpin == PIN) {
				menu();
			} else {
				System.out.println("Enter valid Pin--");
			}
		}

		public void menu() {
				System.out.println("Enter your choice:");
				System.out.println("1. Check A/C Balance");
				System.out.println("2. Deposit Mone");
				System.out.println("3. Withdraw  Money");
				System.out.println("4. Exit");

				Scanner sc = new Scanner(System.in);
				int opt = sc.nextInt();

				if(opt==1) {
					checkBalance();
				}
				else if(opt==2){
					depositMoney();
				}
				else if(opt==3) {
					withdrawMoney();
				}

				else if(opt==4){
					System.out.println("Process finished");
				}
				else {
					System.out.println("Enter valid Choice");

				}
			}
		public void depositMoney() {
			System.out.println("Enter Amount:");
			Scanner sc = new Scanner(System.in);
			float amt = sc.nextFloat();
			Balance=Balance+amt;
			System.out.println("Money deposited succesful");
			menu();
		}

		public void checkBalance() {
			System.out.println("Balance:"+Balance);
			menu();

		}
		public void withdrawMoney() {
			System.out.println("Enter Amount:");
			Scanner sc = new Scanner(System.in);
			float amt = sc.nextFloat();
			if(amt>Balance) {
				System.out.println("Insufficient balance");
			}
			else {
				Balance=Balance-amt;
				System.out.println("Money withdraw succesful");
			}
			menu();

		}

		
	}
	
	