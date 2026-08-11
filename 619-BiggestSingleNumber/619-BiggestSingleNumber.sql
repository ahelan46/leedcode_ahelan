-- Last updated: 8/11/2026, 4:02:27 PM
select max(num) as num
from mynumbers 
where num in(
    select * 
    from mynumbers 
    group by num 
    having count(*)=1
);