use quanlysinhvien;
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select * 
from `subject` s
where s.credit = (select max(s.credit) from `subject` s);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select * 
from `subject` s
join mark m on m.subid = s.subid
where m.mark = (select max(m.mark) from mark m);

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select s.StudentName, s.Address, s.Phone, round(avg(m.mark)) as "avg", count(m.SubId) as count_subject
from student s
join mark m on m.studentid = s.studentid
group by s.studentid  
order by avg desc; 
