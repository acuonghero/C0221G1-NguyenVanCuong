package com.codegym.model.service.impl;

import com.codegym.model.entity.Question;
import com.codegym.model.repository.IQuestionRepository;
import com.codegym.model.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class QuestionServiceImpl implements IQuestionService {
    @Autowired
    IQuestionRepository questionRepository;
    @Override
    public Page<Question> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Question> findById(Long id) {
        return questionRepository.findById(id);
    }

    @Override
    public void save(Question question) {
        questionRepository.save(question);
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public List<Question> findAll() {
        return null;
    }

    @Override
    public Page<Question> searchProduct(String name, Pageable pageable) {
        return questionRepository.searchProduct(name,pageable);
    }
}
