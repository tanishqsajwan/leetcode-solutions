select Employee.name , Bonus.bonus
From 
Employee
Left Join  Bonus
ON Employee.empId = Bonus.empId
where bonus < 1000 OR bonus is null 