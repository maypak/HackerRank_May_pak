/*
Enter your query here.
*/
-- A1
SELECT CONCAT(Name, '(', SUBSTRING(Occupation, 1, 1), ')') FROM OCCUPATIONS ORDER BY NAME;

-- A2
SELECT
    CONCAT('There are a total of ', c, ' ', LOWER(Occupation), 's.')
FROM (SELECT 
      Occupation, 
      COUNT(Occupation) AS c 
      FROM OCCUPATIONS 
      GROUP BY Occupation 
      ORDER BY c, Occupation) T;