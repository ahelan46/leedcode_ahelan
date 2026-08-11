-- Last updated: 8/11/2026, 4:02:35 PM
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;