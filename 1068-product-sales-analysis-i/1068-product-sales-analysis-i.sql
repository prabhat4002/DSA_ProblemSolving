# Write your MySQL query statement below

select a.product_name, b.year, b.price from
product a JOIN sales b
on a.product_id=b.product_id;