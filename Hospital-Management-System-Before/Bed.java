import java.util.Scanner;

public class Bed extends Patient{

    public void beddetails(){
        System.out.println("__________Bed Types__________");
        System.out.println();

        System.out.println("1.Manual Bed");
        System.out.println("2.Semi-electric Bed");
        System.out.println("3.Fully-Electric Bed");
        System.out.println();

        System.out.println("Enter the bed you need: ");
        Scanner be = new Scanner(System.in);
        int bed = be.nextInt();
        System.out.println();

        Bed b1 = new Bed();
        b1.patienddetails();

        System.out.println("________________________________");
        if (bed == 1) {
            System.out.println("you booked Manual bed");
        } else if (bed == 2) {
            System.out.println("you booked semi-electric bed");
        } else if (bed == 3) {
            System.out.println("you booked fully-electric bed");
        }
        System.out.println("________________________________");

    }
}
