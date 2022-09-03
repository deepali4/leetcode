# Write your MySQL query statement below

SELECT name as Employee from Employee e  where e.managerId is not null and salary > (

    Select  salary from Employee  where id = e.managerId
)
