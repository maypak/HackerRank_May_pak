/*
Enter your query here.
*/
SELECT N,
    CASE
        WHEN P IS NULL THEN 'Root'
        WHEN N in (SELECT P FROM BST) THEN 'Inner'
        ELSE 'Leaf'
    END AS Node    
FROM BST
ORDER BY N