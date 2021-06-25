package com.codegym.model.dto;
import javax.validation.constraints.*;

public class FormDto  {

    private Long id;
    @NotBlank(message = "Please input first name")
    @Size(min = 2, max = 30, message = "Invalid format first name")
    private String firstName;
    @NotBlank(message = "Please input last name")
    @Size(min = 2, max = 30, message = "Invalid format last name")
    private String lastName;
    @NotBlank(message = "Please input first phone number")
    @Pattern(regexp = "^0[0-9\\s.-]{9,13}$", message = "Invalid format phone number, ex : 0901234567")
    private String phoneNumber;
    @Min(18)
    @NotBlank(message = "lỗi")
    private String age;
    @NotBlank(message = "Please input first email")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,6}$", message = "Invalid format email, ex : abc@domain.com")
    private String email;

    public FormDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
