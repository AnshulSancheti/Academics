
# Questions
Q1. Update Meera’s department to Computer Science.

Q2. Update Rahul’s payment_status to 'Paid'.

Q3. Increase the age of all students from Delhi by 1.

Q4. Display student_name and department_name for all students who have a department assigned.

Q5. Display course_name and instructor_name for all courses that have an instructor assigned.

Q6. Display student_name, course_name, and grade for all enrolled students.

Q7. Display all students with their department names, including students without a department.

Q8. Find students who do not have any department assigned.

Q9. Display all courses with instructor names, including courses without instructors.

Q10. Find courses that do not have any instructor assigned.

Q11. Display student_name, course_name, instructor_name, and grade for every enrollment.

Q12. Display student_name, course_name, marks, and result_status for every student who has an exam result.

Q13. Display student_name, course_name, classes_attended, total_classes, and marks.

Q14. Find all students enrolled in courses taught by Dr. Sharma.

Q15. Find students who are enrolled in a course but do not have a payment record.

Q16. Find students whose attendance is below 60%.

Q17. Update result_status to 'Fail' for all students whose marks are less than 40.

Q18. Update payment_status to 'Pending' for students who are enrolled in Database Management Systems and have failed the exam.

# Answers

1) update students
    -> set dept_id = 1
    -> where student_id=110;
2) update payments
    -> set payment_status = 'Paid'
    -> where student_id = 105;
3) update students
    -> set age = age+1
    -> where city = 'Delhi'
4) select student_name, dept_name
	-> from students s join departments d 
	-> on s.dept_id = d.dept_id;
5) select course_name, instructor_name 
    -> from courses c join instructors i 
    -> on c.instructor_id = i.instructor_id;
6) select s.student_name, c.course_name, e.grade from enrollments e join students s on e.student_id = s.student_id join courses c on e.course_id = c.course_id;
7) select student_name, dept_name 
    -> from students s left join departments d on s.dept_id = d.dept_id;
8) select * from students
    -> where dept_id IS null;
9)  select course_name, instructor_name from
    -> courses c left join instructors i on c.instructor_id = i.instructor_id;
10) select course_id, course_name
	-> from courses 
	-> where instructor_id is null;
11) select s.student_name, c.course_name, instructor_name, e.grade 
    -> from enrollments e join students s on e.student_id = s.student_id
    -> join courses c on e.course_id = c.course_id
    -> join instructors i on c.instructor_id = i.instructor_id;
12) select student_name, course_name, marks, result_status 
    -> from exam_results er
    -> join
    -> students s on er.student_id = s.student_id
    -> join
    -> courses c on er.course_id = c.course_id;
13) 