package ss13_thuat_toan_tim_kiem.bai_tap;

public class TimKiemNhiPhanSuDungDeQuy {


    public static int binarysearch(int[] list, int low, int high, int value) {

        if (high >= low) {
            int mid = (low + high) / 2;
            if(list[mid]==value){
                return mid;
            }
            if(list[mid]>value){
                return binarysearch(list,low,mid -1,value);
            }else {
                return binarysearch(list,mid+1,high,value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
         int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println( binarysearch(list,0,list.length-1,59));
    }
}
