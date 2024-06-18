import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class GeneratetheBill extends Patient{

    double dpay = 2500.00;
    double fbd = 5000.00;
    double sbd = 2500.00;
    double mbd = 1500.00;
    double day = 2000.00;
    public void generatebill() {
    	displayOptions();
        int choice = getUserChoice();
        processChoice(choice);
    }

    private void displayOptions() {
        System.out.println("1. Allocating Doctor");
        System.out.println("2. Discharging");
        System.out.println();
    }

    private int getUserChoice() {
        System.out.println("What you have to pay: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void processChoice(int choice) {
        switch (choice) {
            case 1:
                printDoctorInvoice();
                break;
            case 2:
                processDischarge();
                break;
        }
    }

    private void printDoctorInvoice() {
        System.out.println("__________________________________");
        System.out.println("             Invoice              ");
        System.out.println("__________________________________");
        System.out.println("Patient name   : " + name);
        System.out.println("Patient age    : " + age);
        System.out.println("Patient tel no : " + tel);
        System.out.println();
        System.out.println("Doctor channeling payment: " + dpay);
        System.out.println();
        double total = dpay;
        printInvoice(total, 0, 0, "");
    }

    private void processDischarge() {
        System.out.println("How many days admit in hospital: ");
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int bedChoice = getBedChoice();

        double bedCost = 0;
        String bedType = "";
        switch (bedChoice) {
            case 1:
                bedCost = day * days + mbd + dpay;
                bedType = "Manual Bed";
                break;
            case 2:
                bedCost = day * days + sbd + dpay;
                bedType = "Semi-electric Bed";
                break;
            case 3:
                bedCost = day * days + fbd + dpay;
                bedType = "Fully-electric Bed";
                break;
        }

        double total = day * days + bedCost + dpay;
        printInvoice(total, days, bedCost, bedType);
    }

    private int getBedChoice() {
        System.out.println("1. Manual Bed");
        System.out.println("2. Semi-electric Bed");
        System.out.println("3. Fully-Electric Bed");
        System.out.println();
        System.out.println("Which Bed you are booking: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void printInvoice(double total, int days, double bedCost, String bedType) {
        System.out.println("__________________________________");
        System.out.println("             Invoice              ");
        System.out.println("__________________________________");
        System.out.println("Patient name   : " + name);
        System.out.println("Patient age    : " + age);
        System.out.println("Patient tel no : " + tel);
        System.out.println();
        System.out.println("Days of Admit       : " + days);
        System.out.println("Charge for Day      : " + day);
        System.out.println(bedType + "        : " + bedCost);
        System.out.println("Doctor allocating   : " + dpay);
        System.out.println();
        System.out.println("Total                    : " + total);
        System.out.println("___________________________________");
        String date = new SimpleDateFormat("YYYY_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
        System.out.println("________" + date + "________");
    }

}
