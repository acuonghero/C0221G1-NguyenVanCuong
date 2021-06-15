package com.dictionary.model.service.impl;

import com.dictionary.model.service.IDictionaryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DictionaryServiceImpl implements IDictionaryService {
    @Override
    public List<String> translate(String input) {
        List result = new ArrayList<>();
        String [] vietNam ={"xin chao","tam biet","cam on"};
        String [] english ={"hello","goodbye","thanks"};
        for(int i = 0; i<vietNam.length;i++){
            if((input.toUpperCase()).equals(vietNam[i].toUpperCase())){
                result.add(english[i]);
                break;
            }else if((input.toUpperCase()).equals(english[i].toUpperCase())){
                result.add(vietNam[i]);
                break;
            }else {
                result.add("Not Found !!");
                break;
            }
        }
        return result;
    }
}
