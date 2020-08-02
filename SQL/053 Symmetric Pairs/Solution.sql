SELECT * from ( SELECT f1.X , f1.Y from FUNCTIONS f1,FUNCTIONS f2 
where f1.X = f2.Y and f1.Y = f2.X and f1.X < f1.Y 
union
SELECT x , y from FUNCTIONS GROUP BY x,y having count(*) > 1) f 
order by f.X;