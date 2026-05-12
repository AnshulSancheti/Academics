1) SELECT * 
	-> FROM students;
2) SELECT student_name, email, city
	-> FROM students;
3) SELECT student_name, city 
    -> FROM students
    -> WHERE city = 'Delhi'
    -> ;
4) SELECT student_name, cgpa
    -> FROM students
    -> WHERE cgpa > 8.0;
5) SELECT student_name, admission_year
    -> FROM students
    -> WHERE admission_year > 2021;
6) SELECT * 
    -> FROM students
    -> WHERE gender = 'Female';
7) SELECT student_name, phone
    -> FROM students
    -> WHERE phone IS NOT NULL;
8) SELECT course_id, course_name
    -> FROM courses
    -> WHERE credits > 3;
9) SELECT instructor_id, instructor_name
    -> FROM instructors
    -> WHERE joining_year < 2020;
10) SELECT department_name
    -> FROM departments
    -> WHERE building = 'Block C';
11) SELECT student_name, cgpa
    -> FROM students
    -> ORDER BY cgpa DESC;
12) SELECT student_name, cgpa
    -> FROM students
    -> ORDER BY cgpa DESC
    -> LIMIT 5;
13) SELECT course_id, course_name
    -> FROM courses
    -> ORDER BY course_name ASC;
14) SELECT student_name, admission_year
    -> FROM students
    -> ORDER BY admission_year DESC;
15) SELECT instructoKengeri Bus Terminal, Mailasandra, Bengaluru, Karnatakar_name, joining_year
    -> FROM instructors
    -> ORDER BY joining_year ASC;
16) SELECT student_name, cgpa
    -> FROM students
    -> WHERE cgpa BETWEEN 7.0 AND 9.0;
17) SELECT student_id, student_name, city 
    -> FROM students
    -> WHERE city IN ('Delhi', 'Mumbai');
18) SELECT student_name
    -> FROM students
    -> WHERE student_name LIKE 'A%';
19) SELECT * 
    -> FROM courses
    -> WHERE course_code LIKE '%cs%';
20) SELECT * 
    -> FROM course_enrollments
    -> WHERE grade IS NOT NULL;
21) 
