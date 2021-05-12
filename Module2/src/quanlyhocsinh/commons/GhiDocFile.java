package quanlyhocsinh.commons;

import quanlyhocsinh.models.Person;
import quanlyhocsinh.models.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GhiDocFile {
    private static final String PATH="src/quanlyhocsinh/data/";
    public static void ghiFile(String fileName, List<Person> lists,boolean trangThai){
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(PATH+fileName);
            fileWriter = new FileWriter(file,trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Person list : lists){
                bufferedWriter.write(list.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Person> docFile(String fileName){
        String path = PATH + fileName;
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<Person> personList = new ArrayList<>();
        String line = null;
        String[] strings = null;
        try {
            file = new File(path);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
           while ( (line = bufferedReader.readLine() ) != null ){
               strings = line.split(",");
               Person student = new Student(strings[0],strings[1],strings[2],strings[3],strings[4]);
               personList.add(student);
           }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
       return  personList;
    }
}
