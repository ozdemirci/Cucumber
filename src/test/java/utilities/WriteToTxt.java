package utilities;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToTxt {



    public static void savePhysicianIds(String fileName, List<Object> id){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,false));

            for (int i=0; i< id.size(); i++)
                writer.append(id.get(i).toString()+",\n");

            writer.close();
        } catch (IOException e){
        }
    }

    public static void savePhysicianFirstName(String fileName, List<Object> firstname){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,false));

            for (int i=0; i< firstname.size(); i++)
                writer.append(firstname.get(i).toString()+",\n");

            writer.close();
        } catch (IOException e){
        }
    }

    public static void savePhysicianLastName(String fileName, List<Object> lastname){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,false));

            for (int i=0; i< lastname.size(); i++)
                writer.append(lastname.get(i).toString()+",\n");

            writer.close();
        } catch (IOException e){
        }
    }


    public static void saveMessages(String fileName, List<Object> message){
=======

    public static void saveAppointmenIds(String fileName, List<Object> id) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < id.size(); i++)
                writer.append(id.get(i).toString() + ",\n");

            writer.close();
        } catch (IOException e) {
        }
    }


    public static void saveMessages(String fileName, List<Object> id) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,false));

            for (int i=0; i< message.size(); i++)
                writer.append(message.get(i).toString()+",\n");

            writer.close();
        } catch (IOException e){
        }
    }

    public static void saveCountryName(String fileName, List<Object> countryName){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,false));

            for (int i=0; i< countryName.size(); i++)
                writer.append(countryName.get(i).toString()+",\n");

            writer.close();
        } catch (IOException e){
        }
    }

    public static void countryIds(String fileName, List<Object> id){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,false));

            for (int i=0; i< id.size(); i++)
                writer.append(id.get(i).toString()+",\n");

            writer.close();
        } catch (IOException e){
        }
    }

    public static void cityIds(String fileName, List<Object> id){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,false));

            for (int i=0; i< id.size(); i++)
                writer.append(id.get(i).toString()+",\n");

            writer.close();
        } catch (IOException e){
        }

    }
}