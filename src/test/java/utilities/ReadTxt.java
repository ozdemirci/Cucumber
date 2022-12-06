package utilities;

import pojos.Appointments;
import pojos.Physician;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadTxt {


    public static List<Object> returnPhysicianIDsList(String filePath) {
        List<Object> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Physician physician = new Physician();
                physician.setId(Integer.parseInt(line.split(",")[0]));
                sb.append(System.lineSeparator());
                line = br.readLine();

//                System.out.println(i++);

                all.add(physician.getId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }


    public static List<String> returnPhysicianFirstName(String filePath) {
        List<String> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Physician physician = new Physician();
                physician.setFirstName(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();

//                System.out.println(i++);

                all.add(physician.getFirstName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }


    public static List<String> returnPhysicianLastName(String filePath) {
        List<String> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Physician physician = new Physician();
                physician.setLastName(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();

//                System.out.println(i++);

                all.add(physician.getFirstName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }

    public static List<Object> returnAppointmentIDsList(String fileName) {

        List<Object> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                //Physician physician = new Physician();
                Appointments appointments = new Appointments();
               // physician.setId(Integer.parseInt(line.split(",")[0]));
                appointments.setId(Integer.parseInt(line.split(",")[0]));
                sb.append(System.lineSeparator());
                line = br.readLine();

//                //System.out.println(i++);

                all.add(appointments.getId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }
}