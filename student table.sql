use stud;
CREATE table student (s_no int primary key, name varchar(20) not null);
drop table student;

insert into student values(1, 'raja');
insert into student values(2, 'dhiva');

select name from student where s_no=1;
