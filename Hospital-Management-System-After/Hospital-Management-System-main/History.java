public class History extends Patient {

    public void showhistory(){

        printHeader();

        printDetails();

        printHistory();
    }

	private void printHistory() {
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

	private void printDetails() {
		patienddetails();
        System.out.println();
	}

	private void printHeader() {
		System.out.println("_______________________");
        System.out.println("Patient Disease History");
        System.out.println("_______________________");
        System.out.println();
	}





}
