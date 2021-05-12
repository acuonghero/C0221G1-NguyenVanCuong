package baithi.commons;


public class DanhBaException extends Exception {
    public DanhBaException(String message) {
        super(message);
    }


    public static void kiemTraSoDienThoai(String input) throws DanhBaException{
        String regex = "^[0-9]{10}$";
        if(input.matches(regex)==false){
            throw new DanhBaException("nhập sai định dạng!!!");
        }
    }

    public static void kiemTraEmail(String input) throws DanhBaException{
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        if (input.matches(regex)==false){
            throw new  DanhBaException("nhập sai định dạng!!!");
        }
    }
}
