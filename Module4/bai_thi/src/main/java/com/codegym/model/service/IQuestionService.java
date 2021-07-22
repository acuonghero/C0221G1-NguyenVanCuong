package com.codegym.model.service;

import com.codegym.model.entity.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IQuestionService extends IGeneralService<Question> {
    Page<Question> searchProduct(String title, Pageable pageable);
}
