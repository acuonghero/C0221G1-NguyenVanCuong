package com.codegym.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
//@Getter
//@Setter
public class Question {
//      + id: khóa chính với kiểu dữ liệu là kiểu số tự tăng
//  + title: tiêu đề câu hỏi với kiểu dữ liệu văn bản
//  + question: Nội dung của câu hỏi với kiểu dữ liệu văn bản
//  + answer: Nội dung phản hồi của câu hỏi với kiểu dữ liệu văn bản
//  + id_question_type: là khóa ngoại tham chiếu từ table [QuestionType]
//            + date_create: Ngày tạo câu hỏi
//  + status: Tình trạng câu hỏi là “Chờ phản hồi” hoặc “Đã phản hồi”

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String question;
    private String answer;
    private String date;
    @ManyToOne(targetEntity = QuestionType.class)
    @JoinColumn(referencedColumnName = "id")
    private QuestionType questionType;
    private String status;
    private boolean flag=true;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
