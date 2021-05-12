package quanlyhocsinh.commons;

public class PersonException extends Exception{
    public PersonException(String message) {
        super(message);
    }
    public static void checkFormat(String property,String input , String regex) throws PersonException {
        if(!input.matches(regex)){
            throw new PersonException("loi dinh dang " + property +": " + regex);
        }
    }
}
