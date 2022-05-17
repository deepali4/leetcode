# Write your MySQL query statement below
Select email from Person 
Group by email   
having count(email)>1