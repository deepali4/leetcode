# Write your MySQL query statement below
SELECT NAME AS 'Employee' from Employee E
WHERE E.managerId IS NOT NULL  AND E.salary > 
(
SELECT salary FROM Employee WHERE id= E.managerId
)

