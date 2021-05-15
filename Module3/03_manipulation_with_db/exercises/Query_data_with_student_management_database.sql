use quanlysinhvien;
INSERT INTO Class
VALUES (1, 'A1', '2008-12-20', 1);
INSERT INTO Class
VALUES (2, 'A2', '2008-12-22', 1);
INSERT INTO Class
VALUES (3, 'B3', current_date, 0);
INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO Student (StudentName, Address, Status, ClassId)
VALUES ('Hoa', 'Hai phong', 1, 1);
INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Manh', 'HCM', '0123123123', 0, 2);
INSERT INTO Subject
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
INSERT INTO Mark (SubId, StudentId, Mark, ExamTimes)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
       
-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’  
select * 
from student
where StudentName like "h%";

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select * 
from class 
where Status=1 ;

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select * 
from subject  
where Credit >=3 and Credit <=5 ;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
SET SQL_SAFE_UPDATES = 0;
update student 
set classid = 2
where studentname = "hung"; 
select *
from student;

-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select student.studentname, subject.subname, mark.Mark
from student
join mark
on student.studentid = Mark.Studentid
join `subject` 
on mark.subid = subject.subid
order by mark.Mark desc, Student.StudentName asc;