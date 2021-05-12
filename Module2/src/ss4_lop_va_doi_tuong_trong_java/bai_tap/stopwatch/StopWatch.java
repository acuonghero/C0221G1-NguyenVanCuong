package ss4_lop_va_doi_tuong_trong_java.bai_tap.stopwatch;



public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){

    }
    public StopWatch(long startTime){
        this.startTime=startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public long Start(){
       startTime =System.currentTimeMillis();
        return startTime;
    }
    public long End(){
        endTime =System.currentTimeMillis();
        return  endTime;
    }
    public long getElapsedTime(){
        return endTime-startTime;
    }
//    public String toString(){
//return "Thời gian thay đổi " + getStartTime();
//    }
}
