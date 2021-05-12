package baithi.commons;

import baithi.models.DanhBa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GhiDocFileDanhBa {
    private static String PATH="src/baithi/data/";
    public static void ghiFile(String fileName, List<DanhBa> danhBaList, boolean trangThai){
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            file =new File(PATH+fileName);
            fileWriter = new FileWriter(file,trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (DanhBa danhBa : danhBaList){
                bufferedWriter.write(danhBa.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<DanhBa> docFile(String fileName){
        String path = PATH + fileName;
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<DanhBa> danhBaList = new ArrayList<>();
        String line = null;
        String[] strings = null;
        try {
            file = new File(path);
            if (!file.exists()){
                file.createNewFile();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ( (line = bufferedReader.readLine() ) != null ){
                strings = line.split(",");
                DanhBa danhBa = new DanhBa(strings[0],strings[1],strings[2],strings[3],strings[4],strings[5],strings[6]);
                danhBaList.add(danhBa);
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
        return  danhBaList;
    }
}
