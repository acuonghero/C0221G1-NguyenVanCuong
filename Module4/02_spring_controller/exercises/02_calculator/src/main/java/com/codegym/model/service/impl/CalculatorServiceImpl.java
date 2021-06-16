package com.codegym.model.service.impl;

import com.codegym.model.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class CalculatorServiceImpl implements ICalculatorService {
    @Override
    public String calculator(Map<String, String> map) {
        String result="";
        try{
            double num1 = Double.parseDouble(map.get("num1"));
            double num2 = Double.parseDouble(map.get("num2"));
            String operator = map.get("operator");

            switch (operator){
                case "+":
                    result = Double.toString(num1+num2);
                    break;
                case "-":
                    result = Double.toString(num1-num2);
                    break;
                case "*":
                    result = Double.toString(num1*num2);
                    break;
                case "/":
                    if(num2==0){
                        result="please don't input num 0";
                        break;
                    }else {
                        result = Double.toString(num1/num2);
                        break;
                    }
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
