import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Discharge extends Patient{
    static String conditiom;

    public void dischargedetails(){
        System.out.println("Enter the patient condition: ");
        Scanner cd = new Scanner(System.in);
        conditiom = cd.next();
        System.out.println();

        printDischargeForm();
        displayPatientDetails();
        displayPatientCondition();
        displayDischargeTime();
    }

	private void displayPatientCondition() {
		System.out.println("Patient Condition: "+conditiom);
        System.out.println();
	}

	private void displayPatientDetails() {
		Discharge d1 = new Discharge();
        d1.patienddetails();
        System.out.println();
	}

	private void displayDischargeTime() {
		String date = new SimpleDateFormat("YYYY_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
        System.out.println("Discharging  time:  "+ date);
        System.out.println();
	}

	private void printDischargeForm() {
		System.out.println("_______________________");
        System.out.println("     Discharge Form    ");
        System.out.println("_______________________");
        System.out.println();
	}
}
