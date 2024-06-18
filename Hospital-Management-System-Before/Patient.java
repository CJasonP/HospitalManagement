import java.util.Random;
import java.util.Scanner;

public class Patient {
    static String name;
    static int age;
    static int tel;
    static String address;
    static String disease;
    static int code;
    static int num;

    public void patientd(){
        System.out.println("Enter the Patient name: ");
        Scanner inputn = new Scanner(System.in);
        name = inputn.next();

        System.out.println("Enter the patient age: ");
        Scanner inputa = new Scanner(System.in);
        age = inputa.nextInt();

        System.out.println("Enter the patient tel no: ");
        Scanner inputat = new Scanner(System.in);
        tel = inputat.nextInt();

        System.out.println("Enter the patient address: ");
        Scanner inputad = new Scanner(System.in);
        address = inputad.next();
        System.out.println();

        System.out.println("Enter the patient disease: ");
        System.out.println("(heart_case, eye_case, bone_case, cardiologist_case, ear_case)"); /*enter diseases like heart_case,eye_case */
        Scanner inputd = new Scanner(System.in);
        disease = inputd.next();
        System.out.println();

        System.out.println("Patient code is: ");
        Scanner inputh = new Scanner(System.in);
        code = inputh.nextInt();

        Random rn = new Random();
        num = rn.nextInt(1,10);

    }

    public void patienddetails(){
        System.out.println("Patient name: "+name);
        System.out.println("Patienr age: "+age);
        System.out.println("Patient tel no: "+tel);
    }

    public void showpatient(){
        System.out.println("________Patient Details________");
        System.out.println();
        System.out.println("Patient Name           : "+name);
        System.out.println("Patient age            : "+age);
        System.out.println("Patient tel            : "+tel);
        System.out.println("Patient address        : "+address);
        System.out.println("Patient disease        : "+disease);
        System.out.println();
        System.out.println("Patient attending Code : P"+num);
    }





}




