package ss4_lop_va_doi_tuong_trong_java.bai_tap.stopwatch;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.Start();
        int[] arr = new int[100000];
        for(int i =0;i<arr.length;i++){
            arr[i]=(int) Math.round(Math.random()*100000) ;
        }
        Arrays.sort(arr);
        stopWatch.End();

        System.out.println("Thời gian thực thi "+stopWatch.getElapsedTime());
    }
}
