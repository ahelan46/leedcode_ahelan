-- Last updated: 8/11/2026, 4:05:29 PM
SELECT email FROM Person
GROUP BY email
HAVING COUNT(email) > 1;# Write your MySQL query statement below
