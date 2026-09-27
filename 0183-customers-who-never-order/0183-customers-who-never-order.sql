# Write your MySQL query statement below
select name as Customers
from Customers left join Orders
ON Customers.id= Orders.customerId
where Orders.customerId is null;