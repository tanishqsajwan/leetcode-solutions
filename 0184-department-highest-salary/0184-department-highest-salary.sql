# Write your MySQL query statement below
select d.name as Department, e1.name as Employee , e1.salary as Salary
from Employee e1 
Join Department d
On e1.departmentId = d.id
where e1.salary = (
    select MAX(salary)
    from Employee
    where departmentId = e1.departmentId
);
