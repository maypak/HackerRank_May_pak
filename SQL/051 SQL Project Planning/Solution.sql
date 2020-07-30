WITH grps AS (
    select start_date,
    end_date,
    start_date - row_number() over (order by start_date) grp_date 
    FROM Projects
) 
SELECT
    MIN(start_date), 
    MAX(end_date) 
FROM grps 
GROUP BY grp_date
ORDER BY count(1), MIN(start_date) ;

