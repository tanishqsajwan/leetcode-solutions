select(
    Select Distinct salary
    From Employee
    order by salary desc
    limit 1 offset 1 
)as SecondHighestSalary;