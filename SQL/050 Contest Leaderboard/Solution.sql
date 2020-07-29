select a.hacker_id, b.name, sum(a.score) as scr from
(select 
hacker_id, challenge_id, Max(score) as score
from Submissions 
group by hacker_id, challenge_id) a 
inner join hackers b on a.hacker_id = b.hacker_id
where a.score > '0'
group by  a.hacker_id, b.name
order by scr desc, hacker_id