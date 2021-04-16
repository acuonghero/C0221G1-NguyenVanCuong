package casestudy_furama_resort.model;

public class Customer{
    private String name;
    private String birthday;
    private String gender;
    private long identityCard;
    private int phoneNumber;
    private String email;
    private String typeOfCustomer;
    private String address;
    private Services servicesUsed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(long identityCard) {
        this.identityCard = identityCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServicesUsed() {
        return servicesUsed;
    }

    public void setServicesUsed(Services servicesused) {
        this.servicesUsed = servicesused;
    }

    public static void showInfor(){
//        System.out.println("Customer{" +
//                "name='" + name + '\'' +
//                ", birthday='" + birthday + '\'' +
//                ", gender='" + gender + '\'' +
//                ", identityCard=" + identityCard +
//                ", phoneNumber=" + phoneNumber +
//                ", email='" + email + '\'' +
//                ", typeOfCustomer='" + typeOfCustomer + '\'' +
//                ", address='" + address + '\'' +
//                ", servicesUsed=" + servicesUsed +
//                '}');
    }

}
