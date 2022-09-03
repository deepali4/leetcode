# Write your MySQL query statement below

# SELECT name as Employee from Employee e  where e.managerId is not null and salary > (

#     Select  salary from Employee  where id = e.managerId
# )


SELECT
    a.Name AS 'Employee'
FROM
    Employee AS a,
    Employee AS b
WHERE
    a.ManagerId = b.Id
        AND a.Salary > b.Salary
;