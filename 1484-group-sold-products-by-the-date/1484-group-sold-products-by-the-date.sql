# Write your MySQL query statement below


SELECT sell_date, count(distinct(product)) as num_sold , Group_Concat(distinct( product )) as products   from Activities  group by sell_date  ;