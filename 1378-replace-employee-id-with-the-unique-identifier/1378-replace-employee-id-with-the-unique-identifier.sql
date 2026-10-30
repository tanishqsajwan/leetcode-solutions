# Write your MySQL query statement below
Select u.unique_id, e.name 
FROM Employees e
LEFT JOIN EmployeeUNI u
ON e.id = u.id