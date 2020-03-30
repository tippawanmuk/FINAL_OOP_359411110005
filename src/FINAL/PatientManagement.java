package FINAL;

import java.util.Scanner;

public class PatientManagement {
    public static void  main(String[]args){
        PatientDAOlmp dao =PatientDAOlmp.getInstance();
//displayAllPatent(dao);
//addNewPatient(dao);
//UpdatePatientByID(dao);
//findPatient(dao);
deletePatientByID(dao);

    }

    private static void deletePatientByID(PatientDAOlmp dao) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Patient ID that yoy want delete:");
        int id =Integer.parseInt(sc.nextLine());
        dao.deletePAT(id);
    }

    private static void findPatient(PatientDAOlmp dao) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Patient ID.");
        int id = Integer.parseInt(sc.nextLine());
        Patient PAT =dao.findPAT(id);
        System.out.print(PAT.toString());
    }

    private static void UpdatePatientByID(PatientDAOlmp dao) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Patient ID");
        int id = Integer.parseInt(sc.nextLine());
        Patient PAT = dao.findPAT(id);
        System.out.print(PAT.toString());

        System.out.print("Enter new age for Patient ID;"+ PAT.getP_id());

    }

    private static void addNewPatient(PatientDAOlmp dao) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Patient ID.");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Patient name.");
        String p_name = sc.nextLine();
        System.out.print("Enter Patient gender.");
        String p_gender = sc.nextLine();
        System.out.print("Enter Patient Age.");
        int p_age =Integer.parseInt(sc.nextLine());
        System.out.print("Enter Patient address.");
        String p_address = sc.nextLine();
        System.out.print("Enter Patient blood result.");
        String p_blood_result =sc.nextLine();

        dao.addPAT(new Patient(id,p_name,p_gender,p_age,p_address,p_blood_result));

    }


    private static void displayAllPatent(PatientDAOlmp dao) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Patient ID that you want to delete:");
        int id = Integer.parseInt(sc.nextLine());
        dao.deletePAT(id);
    }

}
