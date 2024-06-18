import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        boolean condition = true;
        while (condition == true) {

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("========================================");
            System.out.println("           Suwasewana Hospital          ");
            System.out.println(" Galle Road, Colombo 10. +947185236974  ");
            System.out.println("========================================");

            System.out.println("1.Admit a new patient");
            System.out.println("2.Allocate a doctor ");
            System.out.println("3.Allocate a bed ");
            System.out.println("4.history of a patient");
            System.out.println("5.Medication prescriptions ");
            System.out.println("6.Discharge a patient");
            System.out.println("7.Generate the bill");
            System.out.println("8.Exit");
            System.out.println();

            System.out.println("Welcome to Suwasewana Hospital what you want from us:- ");
            System.out.println("_______________________________________________________");
            Scanner ch = new Scanner(System.in);
            int select = ch.nextInt();

            switch (select) {
                case 1:
                    System.out.println("________Admit a patient________");
                    System.out.println();

                    Patient p1 = new Patient();
                    p1.patientd();
                    System.out.println();
                    p1.showpatient();
                    System.out.println();
                    String date = new SimpleDateFormat("YYYY_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
                    System.out.println("Admit Time: " + date);
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("Admit procedure is complete now you can admit in hospital for more information");
                    System.out.println("                        contact us +947418523                                 ");
                    System.out.println("           Suwasewana Hospital,Galle Road, Colombo 10. +9471852369            ");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    break;

                case 2:
                    System.out.println("________Allocate a Doctor________");
                    System.out.println();

                    Doctor d1 = new Doctor();
                    d1.patientd();
                    System.out.println();
                    d1.doctordetails();
                    System.out.println();
                    break;

                case 3:
                    System.out.println("________Allocate a Bed________");
                    System.out.println();

                    Bed b1 = new Bed();
                    b1.patientd();
                    b1.beddetails();
                    break;

                case 4:
                    System.out.println("________Patient History________");
                    System.out.println();

                    History h1 = new History();
                    h1.patientd();
                    System.out.println();

                    h1.showhistory();
                    break;

                case 5:
                    System.out.println("________Medical Prescription________");
                    System.out.println();

                    Medicalprescription mp = new Medicalprescription();
                    mp.patientd();
                    System.out.println();
                    mp.showprecriptions();
                    break;

                case 6:
                    System.out.println("________Discharging from Hospital________");
                    System.out.println();

                    Discharge di1 = new Discharge();
                    di1.patientd();
                    System.out.println();
                    di1.dischargedetails();
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("Discharging procedure is complete now you can leave the  hospital for more information");
                    System.out.println("                     Wishing you a Healthy future                                     ");
                    System.out.println("                        contact us +947418523                                         ");
                    System.out.println("        Suwasewana Hospital,Galle Road, Colombo 10. +9471852369                       ");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    break;

                case 7:
                    System.out.println("__________Generating Bill_________");
                    GeneratetheBill g1 = new GeneratetheBill();
                    g1.patientd();
                    System.out.println();
                    g1.generatebill();
                    break;

                case 8:
                    System.out.println("___________________________________________________________________");
                    System.out.println("                      Exiting the System                           ");
                    System.out.println("___________________________________________________________________");
                    System.out.println();
                    System.out.println("Thank you for Choosing Suwasewana Hospital for a your Healthy Life ");
                    System.out.println("           We are always committed to your healthy Life            ");
                    System.out.println();
                    System.out.println();
                    System.out.println("            Suwasewana Hospital,Galle Road, Colombo 10.            ");
                    System.out.println("                     Contact us:  +9471852369                      ");
                    System.out.println();
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    break;


            }
        }

    }
}

