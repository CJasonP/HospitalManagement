public class Medicalprescription extends Patient{

    public void showprecriptions(){

        System.out.println("_______________________");
        System.out.println(" Medical Prescription ");
        System.out.println("_______________________");
        System.out.println();

        Medicalprescription m1 = new Medicalprescription();
        m1.patienddetails();
        System.out.println();

        if(disease.equals("heart_case")){
            System.out.println("Azilsartan (Edarbi)\n" +
                    "Candesartan (Atacand)\n" +
                    "Eprosartan (Teveten)\n" +
                    "Irbesartan (Avapro)\n" +
                    "Losartan (Cozaar)\n" +
                    "Olmesartan (Benicar)\n" +
                    "Telmisartan (Micardis)\n" +
                    "Valsartan (Diovan)");
        }
        else if(disease.equals("eye_case")){
            System.out.println("Acetazolamide for glaucoma (Diamox, Eytazox)\n" +
                    "Acetylcysteine for dry eyes (Ilube)\n" +
                    "Aciclovir eye ointment.\n" +
                    "Antazoline and xylometazoline eye drops (Otrivine-Antistin)\n" +
                    "Apraclonidine eye drops (Iopidine)\n" +
                    "Atropine eye drops (Minims Atropine)\n" +
                    "Azelastine eye drops for allergies (Optilast)");
        }
        else if(disease.equals("bone_case")){
            System.out.println("tments to reduce the risk of osteoporotic fractures include:\n" +
                    "\n" + "calcium and vitamin D\n" +
                    "bisphosphonates (alendronate, risedronate, ibandronate, etidronate, zoledronate)\n" +
                    "teriparatide and parathyroid hormone\n" +
                    "raloxifene\n" +
                    "calcitonin\n" +
                    "denosumab\n" +
                    "hormone replacement therapy (HRT).");
        }
        else if(disease.equals("cardiologist_case")){
            System.out.println("Benazepril (Lotensin)\n" +
                    "Captopril (Capoten)\n" +
                    "Enalapril (Vasotec)\n" +
                    "Fosinopril (Monopril)\n" +
                    "Lisinopril (Prinivil, Zestril)\n" +
                    "Moexipril (Univasc)\n" +
                    "Perindopril (Aceon)\n" +
                    "Quinapril (Accupril)");
        }
        else if(disease.equals("ear_case")){
            System.out.println(" amoxicillin (Amoxil), ofloxacin (Floxin Otic), and cephalexin (Keflex)");

        }
        System.out.println("_________________________________________________________________________");
        System.out.println("_________________________________________________________________________");
    }
}
