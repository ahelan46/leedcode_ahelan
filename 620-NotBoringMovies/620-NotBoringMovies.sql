-- Last updated: 8/11/2026, 4:02:23 PM
-- Write your PostgreSQL query statement below
select * 
from cinema 
where id%2=1
and description!='boring'
order by rating desc;