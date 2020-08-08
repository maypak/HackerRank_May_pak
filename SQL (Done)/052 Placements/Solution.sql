select s.name
from students s
left join packages p on p.id = s.id
left join friends f on s.id = f.id
left join packages n on n.id = f.friend_id
where n.salary > p.salary
order by n.salary;