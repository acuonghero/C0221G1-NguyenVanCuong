package com.codegym.model.service.impl;

import com.codegym.model.entity.QuestionType;
import com.codegym.model.repository.IQuestionTypeRepository;
import com.codegym.model.service.IQuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class QuestionTypeServiceImpl implements IQuestionTypeService {
    @Autowired
    IQuestionTypeRepository questionTypeRepository;
    @Override
    public Page<QuestionType> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<QuestionType> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(QuestionType questionType) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public List<QuestionType> findAll() {
        return (List<QuestionType>) questionTypeRepository.findAll();
    }
}
