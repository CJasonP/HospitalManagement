import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Doctor extends Patient {

    public void doctordetails(){
        System.out.println("________Doctors list________");
        System.out.println();

        System.out.println("1.Dr.vishwa" + '\n' + "works in: base hospital homagama" + '\n' + "specialized in: heart case");
        System.out.println();

        System.out.println("2.Dr.anura" + '\n' + "works in: base hospital homagama" + '\n' + "specialized in: eye case");
        System.out.println();

        System.out.println("3.Dr.kumari" + '\n' + "works in: base hospital homagama" + '\n' + "specialized in: bones case");
        System.out.println();

        System.out.println("4.Dr.herath" + '\n' + "works in: base hospital homagama" + '\n' + "specialized in: ear case");
        System.out.println();

        System.out.println("5.Dr.perera" + '\n' + "works in: base hospital homagama" + '\n' + "specialized in: cardiologist case");
        System.out.println();

        System.out.println("___Which doctor you are channeling:___ ");
        Scanner dc = new Scanner(System.in);
        int dselect = dc.nextInt();


        System.out.println("____________________________________");
        System.out.println("______Channeling Statement__________");
        System.out.println();
        Doctor d1 = new Doctor();
        d1.patienddetails();


        if(dselect == 1){
            System.out.println("you channelled Dr.Vishwa");
        }
        else if (dselect == 2) {
            System.out.println("you channeled Dr.anura");
        } else if (dselect == 3) {
            System.out.println("you channeled Dr.kumari");
        } else if (dselect == 4) {
            System.out.println("you channeled Dr.herath");
        } else if (dselect == 5) {
            System.out.println("you channeled Dr.perera");
        }
        String date = new SimpleDateFormat("YYYY_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
        System.out.println("chanelling time:  "+ date);

        System.out.println("____________________________________");
        System.out.println("____________________________________");



    }
}

