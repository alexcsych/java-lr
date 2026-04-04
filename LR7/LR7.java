package LR7;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LR7 {
    private static ArrayList<Long> indexMap = new ArrayList<>();
    private static final String FILE_NAME = "patients.dat";

    public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<>();
        
        patients.add(new Patient(1, "Raider", "John", "Johnson", "Zaporizhzhia", "095-111", 101, "Flu"));
        patients.add(new Patient(2, "Smith", "Jane", "Doe", "Kyiv", "067-222", 205, "Angina"));
        patients.add(new Patient(3, "Raider1", "John2", "Johnson2", "Zaporizhzhia", "063-333", 150, "Flu"));
        patients.add(new Patient(4, "Bond", "James", "Andrew", "Lviv", "050-777", 300, "Injury"));

        try {
            saveToBinaryWithIndex(patients);

            System.out.println("Fast access to patient index 1:");
            Patient p = readSpecificPatient(1); 
            System.out.println(p);

            Scanner scanner = new Scanner(System.in);
            
            System.out.print("\nEnter diagnosis for filtering (e.g., Flu): ");
            String searchDiag = scanner.nextLine().trim();

            System.out.println("Search results for diagnosis '" + searchDiag + "':");
            boolean foundDiag = false;
            for (Patient pat : patients) {
              if (pat.getDiagnosis().equalsIgnoreCase(searchDiag)) {
                System.out.println(pat.toString());
                foundDiag = true;
              }
            }
            if (!foundDiag) System.out.println("No patients found with this diagnosis.");

            System.out.println("\nEnter medical card number range:");
            System.out.print("Start: ");
            int start = scanner.nextInt();
            System.out.print("End: ");
            int end = scanner.nextInt();

            System.out.println("Patients with card numbers in range [" + start + " - " + end + "]:");
            boolean foundRange = false;
            for (Patient pat : patients) {
                int cardNumber = pat.getMedicalCardNumber();
                if (cardNumber >= start && cardNumber <= end) {
                    System.out.println(pat);
                    foundRange = true;
                }
            }
            if (!foundRange) System.out.println("No patients found in this range.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveToBinaryWithIndex(ArrayList<Patient> list) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "rw")) {
            raf.setLength(0);
            indexMap.clear();

            for (Patient p : list) {
                indexMap.add(raf.getFilePointer());

                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(bos);
                oos.writeObject(p);
                byte[] data = bos.toByteArray();

                raf.writeInt(data.length);
                raf.write(data);
            }
        }
        System.out.println("Binary file saved. Index map created: " + indexMap);
    }

    public static Patient readSpecificPatient(int index) throws IOException, ClassNotFoundException {
        try (RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "r")) {
            long pos = indexMap.get(index);
            raf.seek(pos);

            int length = raf.readInt();
            byte[] data = new byte[length];
            raf.readFully(data);

            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            return (Patient) ois.readObject();
        }
    }
}