# Write your MySQL query statement below
select a.name, b.bonus from 
employee a left join bonus b
on a.empid=b.empid where bonus<1000 || bonus is null