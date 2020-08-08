WITH RECURSIVE S(n) AS (
    SELECT 1 AS n
    UNION ALL
    SELECT n + 1 FROM S WHERE n < 1000
)
SELECT GROUP_CONCAT(n SEPARATOR '&') AS PRIMES
FROM (
    SELECT S1.n AS n,
            SUM(CASE WHEN S1.n % S2.n = 0 THEN 1 ELSE 0 END) AS divisors
        FROM S AS S1, S AS S2
        WHERE S2.n < S1.n
        GROUP BY S1.n
        ORDER BY S1.n
) A
WHERE divisors = 1;