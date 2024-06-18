public class History extends Patient {

    public void showhistory(){

        System.out.println("_______________________");
        System.out.println("Patient Disease History");
        System.out.println("_______________________");
        System.out.println();

        History h1 = new History();
        h1.patienddetails();
        System.out.println();

        if(code == 1){
            System.out.println("Patienrt 1 history");
        }
        else if(code == 2){
            System.out.println("patient 2 history");
        }
        else if(code == 3){
            System.out.println("Patient 3 history");
        }
        else if(code == 4){
            System.out.println("Patient 4 history");
        }
        else if(code == 5){
            System.out.println("Patient 5 history");
        }
        System.out.println("_____________________");
    }





}
