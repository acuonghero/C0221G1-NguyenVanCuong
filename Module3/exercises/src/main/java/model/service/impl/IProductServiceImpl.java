package model.service.impl;

import model.bean.Student;
import model.repository.StudentRepository;
import model.service.IStudentService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IStudentServiceImpl implements IStudentService {
    StudentRepository studentRepository = new StudentRepository();
    @Override
    public List<Student> selectAllStudent() {
        return studentRepository.selectAllStudent();
    }

    @Override
    public List<Student> findStudentName(String name) {
        return studentRepository.findStudentName(name) ;
    }

    @Override
    public boolean deleteStudent(int id) {
        return studentRepository.deleteStudent(id);
    }

    @Override
    public Map<String, String> validateCreate(Student student) {
        Map<String, String> mapMsg = new HashMap<>();
        boolean flag = true;
         String DATE = "^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)$"
                + "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
                + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
                + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$";
         String NAME="^[\\p{L} .'-]+$";
         String regexEmail = "^[a-z]\\S+@\\S+\\.\\S+$";
         String regexPhone = "(09|01[2|6|8|9])+([0-9]{8})\\b";

//        Ten-----------------------------
        if("".equals(student.getStudentName())){
            mapMsg.put("name","Please input name !!!");
            flag = false;
        } else if(!student.getStudentName().matches(NAME)){
            mapMsg.put("name", "Invalid format name . Ex : Nguyen Van Cuong");
            flag = false;
        }

//        Email-----------------------------
        if("".equals(student.getStudentEmail())){
            mapMsg.put("email","Please input email !!!");
            flag = false;
        }else if(!student.getStudentEmail().matches(regexEmail)){
            mapMsg.put("email", "Invalid format email . Ex : yourname@yourdomain.com");
            flag = false;
        }

//        So dien thoai--------------------------
        if("".equals(student.getStudentPhone())){
            mapMsg.put("phone","Please input phone number !!!");
            flag = false;
        }
        else if(!student.getStudentPhone().matches(regexPhone)){
            mapMsg.put("phone", "Invalid format phone . Ex : 0912345678");
            flag = false;
        }

//        Ngay sinh---------------------------------
        if("".equals(student.getStudentBirthday())){
            mapMsg.put("birthday","Please input birthday !!!");
            flag = false;
        }
        else if(!student.getStudentBirthday().matches(DATE)){
            mapMsg.put("birthday", "Invalid format day . Ex : dd/mm/yyyy");
            flag = false;
        }
//        Dia chi-------------------------------------
        if("".equals(student.getStudentAddress())){
            mapMsg.put("address","Please input address !!!");
            flag = false;
        }

        if(flag){
            insertStudent(student);
        }
        return mapMsg;
    }

    @Override
    public void insertStudent(Student student) {
         studentRepository.insertStudent(student);
    }

    @Override
    public Student selectStudentById(int id) {
        return studentRepository.selectStudentById(id);
    }

    @Override
    public Map<String, String> validateUpdate(int id, Student student) {
        Map<String, String> mapMsg = new HashMap<>();
        boolean flag = true;
        String DATE = "^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)$"
                + "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
                + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
                + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$";
        String NAME="^[\\p{L} .'-]+$";
        String regexEmail = "^[a-z]\\S+@\\S+\\.\\S+$";
        String regexPhone = "(09|01[2|6|8|9])+([0-9]{8})\\b";

//        Ten-----------------------------
        if("".equals(student.getStudentName())){
            mapMsg.put("name","Please input name !!!");
            flag = false;
        } else if(!student.getStudentName().matches(NAME)){
            mapMsg.put("name", "Invalid format name . Ex : Nguyen Van Cuong");
            flag = false;
        }

//        Email-----------------------------
        if("".equals(student.getStudentEmail())){
            mapMsg.put("email","Please input email !!!");
            flag = false;
        }else if(!student.getStudentEmail().matches(regexEmail)){
            mapMsg.put("email", "Invalid format email . Ex : yourname@yourdomain.com");
            flag = false;
        }

//        So dien thoai--------------------------
        if("".equals(student.getStudentPhone())){
            mapMsg.put("phone","Please input phone number !!!");
            flag = false;
        }
        else if(!student.getStudentPhone().matches(regexPhone)){
            mapMsg.put("phone", "Invalid format phone . Ex : 0912345678");
            flag = false;
        }

//        Ngay sinh---------------------------------
        if("".equals(student.getStudentBirthday())){
            mapMsg.put("birthday","Please input birthday !!!");
            flag = false;
        }
        else if(!student.getStudentBirthday().matches(DATE)){
            mapMsg.put("birthday", "Invalid format day . Ex : dd/mm/yyyy");
            flag = false;
        }
//        Dia chi-------------------------------------
        if("".equals(student.getStudentAddress())){
            mapMsg.put("address","Please input address !!!");
            flag = false;
        }

        if(flag){
            updateStudent(id,student);
        }
        return mapMsg;
    }

    private void updateStudent(int id, Student student) {
        studentRepository.updateStudent(id,student);
    }
}
