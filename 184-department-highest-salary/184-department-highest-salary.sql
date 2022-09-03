# Write your MySQL query statement below


SELECT  D.name AS Department , 
        E.name as Employee ,
        Salary
FROM Employee E JOIN Department D 
        ON E.departmentId = D.id
WHERE (E.departmentId,salary ) in

(SELECT 
        departmentId, MAX(Salary)
    FROM 
        Employee
        GROUP BY DepartmentId

)