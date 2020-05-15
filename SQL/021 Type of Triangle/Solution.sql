/*
Enter your query here.
*/

-- ternary.
SELECT  
-- is triangle?
IF(A+B>C AND A+C>B AND B+C>A, 
--    is Equilateral?
   IF(A=B AND B=C, 'Equilateral', 
--       is Isosceles? or Scalene?
      IF(A=B OR B=C OR A=C,'Isosceles', 'Scalene')),
      'Not A Triangle') 
FROM TRIANGLES;