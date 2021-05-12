package bai_tap.trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;

public class Test {
    public static void main(String[] args) {
        Colorable[] colorables = new Colorable[3];
        colorables[0] = new Circle();
        colorables[1] = new Rectangle();
        colorables[2] = new Square();

        for (Colorable colorable : colorables){
            if(colorable instanceof Square){
              colorable.howToColor();
            }
        }
    }
}
