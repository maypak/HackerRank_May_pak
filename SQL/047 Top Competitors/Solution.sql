SELECT a.hacker_id,c.name
FROM Submissions a,
     Challenges b,
     hackers c,
     difficulty d
     WHERE a.challenge_id = b.challenge_id and
           a.hacker_id = c.hacker_id and b.difficulty_level = d.difficulty_level and           a.score = d.score
GROUP BY a.hacker_id,c.name
HAVING count(a.challenge_id) > 1
ORDER BY count(a.challenge_id) desc, a.hacker_id