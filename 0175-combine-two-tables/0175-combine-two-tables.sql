# Write your MySQL query statement below
Select firstName,lastName ,city ,state
from person Left join address
on person.personId = address.personId;