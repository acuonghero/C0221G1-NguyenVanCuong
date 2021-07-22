package com.codegym.model.dto;

import com.codegym.model.entity.QuestionType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
public class QuestionDto implements Validator {
    private Long id;
    @NotBlank(message = "Please input title !!")
    @Size(min = 10,max = 100)
    private String title;
    @NotBlank(message = "Please input question !!")
    @Size(min = 10,max = 500)
    private String question;
    private String answer;
    private String date= LocalDate.now().toString();
    private QuestionType questionType;
    private String status;
    private boolean flag=true;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        QuestionDto questionDto = new QuestionDto();
        String nameRegex = "^[\\\\p{L} '-]+$";
        if (!questionDto.title.matches(nameRegex)){
            errors.rejectValue("name","Invalid format name");
        }
    }
}
