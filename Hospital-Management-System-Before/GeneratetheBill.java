import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class GeneratetheBill extends Patient{

    double dpay = 2500.00;
    double fbd = 5000.00;
    double sbd = 2500.00;
    double mbd = 1500.00;
    double day = 2000.00;


    public void generatebill(){
        /*i mainly target two type patients in there 1 type is patients comes for doctor channeling and others are admit in the hospital*/

        System.out.println("1.Allocating Doctor");
        System.out.println("2.Discharging");
        System.out.println();

        System.out.println("What you have to pay: ");
        Scanner d1 = new Scanner(System.in);
        int gb = d1.nextInt();


        switch (gb){
            case 1:
                System.out.println("__________________________________");
                System.out.println("             Invoice              ");
                System.out.println("__________________________________");
                System.out.println("Patient name   : "+name);
                System.out.println("Patient age    : "+age);
                System.out.println("Patient tel no : "+tel);
                System.out.println();

                System.out.println("Doctor channeling payment: "+dpay);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("___________________________________");
                System.out.println("Total                    : "+dpay);
                System.out.println("___________________________________");
                System.out.println("___________________________________");
                String date = new SimpleDateFormat("YYYY_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
                System.out.println("________"+ date+"________");
                break;

            case 2:
                System.out.println("How many days admit in hospital: ");
                Scanner day1 = new Scanner(System.in);
                int days = day1.nextInt();


                System.out.println("1.Manual Bed");
                System.out.println("2.Semi-electric Bed");
                System.out.println("3.Fully-Electric Bed");
                System.out.println();
                System.out.println("Which Bed you are booking: ");
                Scanner bo1 = new Scanner(System.in);
                int bd = bo1.nextInt();

                if(bd == 1){
                    double tt = day*days+mbd+dpay;

                    System.out.println("__________________________________");
                    System.out.println("             Invoice              ");
                    System.out.println("__________________________________");
                    System.out.println("Patient name   : "+name);
                    System.out.println("Patient age    : "+age);
                    System.out.println("Patient tel no : "+tel);
                    System.out.println();
                    System.out.println("Days of Admit     :  "+days);
                    System.out.println("Charge for Day    :  "+day);
                    System.out.println("Manual Bed        :  "+mbd);
                    System.out.println("Doctor allocating :  "+dpay);
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("___________________________________");
                    System.out.println("Total                    : "+tt);
                    System.out.println("___________________________________");
                    System.out.println("___________________________________");
                    String date1 = new SimpleDateFormat("YYYY_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
                    System.out.println("________"+ date1+"________");
                }
                else if(bd == 2){
                    double tt1 = day*days+sbd+dpay;

                    System.out.println("__________________________________");
                    System.out.println("             Invoice              ");
                    System.out.println("__________________________________");
                    System.out.println("Patient name   : "+name);
                    System.out.println("Patient age    : "+age);
                    System.out.println("Patient tel no : "+tel);
                    System.out.println();
                    System.out.println("Days of Admit       : "+days);
                    System.out.println("Charge for Day      : "+day);
                    System.out.println("semi-electrical Bed : "+sbd);
                    System.out.println("Doctor allocating   : "+dpay);
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("___________________________________");
                    System.out.println("Total                    : "+tt1);
                    System.out.println("___________________________________");
                    System.out.println("___________________________________");
                    String date1 = new SimpleDateFormat("YYYY_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
                    System.out.println("________"+ date1+"________");
                }
                else if(bd == 3){
                    double tt2 = day*days+fbd+dpay;

                    System.out.println("__________________________________");
                    System.out.println("             Invoice              ");
                    System.out.println("__________________________________");
                    System.out.println("Patient name   : "+name);
                    System.out.println("Patient age    : "+age);
                    System.out.println("Patient tel no : "+tel);
                    System.out.println();
                    System.out.println("Days of Admit            : "+days);
                    System.out.println("Charge for Day           : "+day);
                    System.out.println("Fully-electrical Bed     : "+fbd);
                    System.out.println("Doctor allocating        : "+dpay);
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("___________________________________");
                    System.out.println("Total                    : "+tt2);
                    System.out.println("___________________________________");
                    System.out.println("___________________________________");
                    String date1 = new SimpleDateFormat("YYYY_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
                    System.out.println("________"+ date1+"________");

                }








        }





    }
}
