/*
Enter your query here.
*/
SELECT
NAME
FROM
(SELECT ID, NAME, SUBSTR(NAME, -3) SUB FROM STUDENTS WHERE MARKS > 75) AS T
ORDER BY SUB, ID;