package model.bean;

public class Customer {
    private int customerId;
    private int customerTypeId;
    private String customerName;
    private String customerDayOfBirth;
    private String customerIdentityCard;
    private String customerPhoneNumber;
    private String customerEmail;
    private String customerAddress;

    public Customer() {
    }

    public Customer(int customerTypeId, String customerName, String customerDayOfBirth, String customerIdentityCard, String customerPhoneNumber, String customerEmail, String customerAddress) {
        this.customerTypeId = customerTypeId;
        this.customerName = customerName;
        this.customerDayOfBirth = customerDayOfBirth;
        this.customerIdentityCard = customerIdentityCard;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }

    public Customer(int customerId, int customerTypeId, String customerName, String customerDayOfBirth, String customerIdentityCard, String customerPhoneNumber, String customerEmail, String customerAddress) {
        this.customerId = customerId;
        this.customerTypeId = customerTypeId;
        this.customerName = customerName;
        this.customerDayOfBirth = customerDayOfBirth;
        this.customerIdentityCard = customerIdentityCard;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerDayOfBirth() {
        return customerDayOfBirth;
    }

    public void setCustomerDayOfBirth(String customerDayOfBirth) {
        this.customerDayOfBirth = customerDayOfBirth;
    }

    public String getCustomerIdentityCard() {
        return customerIdentityCard;
    }

    public void setCustomerIdentityCard(String customerIdentityCard) {
        this.customerIdentityCard = customerIdentityCard;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}
