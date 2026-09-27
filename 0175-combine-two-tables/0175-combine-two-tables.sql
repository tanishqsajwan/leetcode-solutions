# Write your MySQL query statement below
Select person.firstName,person.lastName ,address.city ,address.state
from person Left join address
on person.personId = address.personId;