SELECT X.hacker_id,X.name,X.count FROM ((SELECT  
T.*, 
CASE 
   WHEN  
     ((SELECT COUNT(c) as w FROM 
    ((SELECT COUNT(K.challenge_id) as c FROM Challenges K  GROUP BY K.hacker_id) E)
        WHERE c=T.count)) > 1  
   THEN 1 ELSE 0 
END AS Flag
FROM 

(( SELECT H.hacker_id, H.name , COUNT(C.hacker_id)  as count FROM hackers H INNER JOIN Challenges  C ON C.hacker_id = H.hacker_id GROUP BY H.hacker_id,H.name ) T)
 
 WHERE T.count < (SELECT COUNT(K.challenge_id) AS c FROM Challenges  K GROUP BY K.hacker_id AND  K.hacker_id != T.hacker_id ORDER BY c DESC LIMIT 1 )
GROUP by T.hacker_id,T.count,T.name
 
ORDER BY T.count DESC,T.hacker_id) X)

 WHERE (X.flag = 1 AND X.count >=(SELECT COUNT(F.challenge_id) as d FROM Challenges F GROUP BY F.hacker_id ORDER BY d DESC LIMIT 1))
 OR X.FLAG = 0
GROUP BY X.hacker_id,X.name


ORDER BY X.count DESC ,X.hacker_id