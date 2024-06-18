import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Doctor extends Patient {

    private static final String[] doctors = {
        "Dr.vishwa works in: base hospital homagama specialized in: heart case",
        "Dr.anura works in: base hospital homagama specialized in: eye case",
        "Dr.kumari works in: base hospital homagama specialized in: bones case",
        "Dr.herath works in: base hospital homagama specialized in: ear case",
        "Dr.perera works in: base hospital homagama specialized in: cardiologist case"
    };

    public void doctordetails() {
        System.out.println("________Doctors list________");
        System.out.println();

        for (int i = 0; i < doctors.length; i++) {
            System.out.println((i + 1) + "." + doctors[i]);
            System.out.println();
        }

        System.out.println("___Which doctor you are channeling:___ ");
        Scanner dc = new Scanner(System.in);
        int dselect = dc.nextInt();

        System.out.println("____________________________________");
        System.out.println("______Channeling Statement__________");
        System.out.println();
        Doctor d1 = new Doctor();
        d1.patienddetails();

        if (dselect >= 1 && dselect <= doctors.length) {
            System.out.println("you channeled " + doctors[dselect - 1].split(" ")[0]); // Extracting doctor's name
        } else {
            System.out.println("Invalid doctor selection");
        }

        String date = new SimpleDateFormat("YYYY_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
        System.out.println("chanelling time:  " + date);

        System.out.println("____________________________________");
        System.out.println("____________________________________");
    }
}
