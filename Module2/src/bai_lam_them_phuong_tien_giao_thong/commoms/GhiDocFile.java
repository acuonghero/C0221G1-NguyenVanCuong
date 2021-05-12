package bai_lam_them_phuong_tien_giao_thong.commoms;

import bai_lam_them_phuong_tien_giao_thong.model.OTo;
import bai_lam_them_phuong_tien_giao_thong.model.PhuongTien;
import bai_lam_them_phuong_tien_giao_thong.model.XeMay;
import bai_lam_them_phuong_tien_giao_thong.model.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GhiDocFile {
    private static final String PATH="src/bai_lam_them_phuong_tien_giao_thong/data/";
    public static void ghiFile(String fileName, List<PhuongTien> list,boolean trangThai){
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try{
            file = new File(PATH+fileName);
            fileWriter = new FileWriter(file,trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (PhuongTien phuongTien : list){
                bufferedWriter.write(phuongTien.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException e){
                e.getStackTrace();
            }
        }
    }

    public static List<PhuongTien> docFile(String fileName){
        String path = PATH + fileName;
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<PhuongTien> phuongTienList = new ArrayList<>();
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
                if (strings.length==6){
                    PhuongTien phuongTien = new OTo(strings[0],strings[1],strings[2],strings[3],strings[4],strings[5]);
                    phuongTienList.add(phuongTien);
                }else if(strings[0].contains("C")){
                    PhuongTien phuongTien = new XeTai(strings[0],strings[1],strings[2],strings[3],strings[4]);
                    phuongTienList.add(phuongTien);
                }
                else {
                    PhuongTien phuongTien = new XeMay(strings[0], strings[1], strings[2], strings[3], strings[4]);
                    phuongTienList.add(phuongTien);
                }
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
        return  phuongTienList;
    }
}
