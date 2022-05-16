# Write your MySQL query statement below
SELECT NAME AS 'Customers'
FROM Customers c
LEFT join Orders o 
On c.id= o.customerId 
Where customerId  IS NULL