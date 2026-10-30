# Write your MySQL query statement below
Select EmployeeUNI.unique_id, Employees.name 
FROM Employees
LEFT JOIN EmployeeUNI
ON Employees.id = EmployeeUNI.id