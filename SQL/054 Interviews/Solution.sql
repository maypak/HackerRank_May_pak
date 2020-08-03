select 
        cont.contest_id, 
        cont.hacker_id, 
        cont.name, 
        sum(subs.total_submissions), 
        sum(subs.total_accepted_submissions), 
        sum(vs.total_views),
        sum(vs.total_unique_views)
from 
        Contests AS cont 
        join Colleges AS coll 
                on cont.contest_id=coll.contest_id
        join Challenges AS chal
                on coll.college_id=chal.college_id
        left join 
                (select challenge_id,sum(total_views) as total_views, sum(total_unique_views) as 
                 total_unique_views from View_Stats group by challenge_id) AS vs
                 on chal.challenge_id=vs.challenge_id

        left join
                (select challenge_id,sum(total_submissions) as total_submissions,
                 sum(total_accepted_submissions) as total_accepted_submissions from Submission_Stats 
                 group by challenge_id) AS subs
                 on chal.challenge_id=subs.challenge_id
group by 
        cont.contest_id, 
        cont.hacker_id, 
        cont.name
having 
        (
        sum(subs.total_submissions)+ 
        sum(subs.total_accepted_submissions)+ 
        sum(vs.total_views)+
        sum(vs.total_unique_views)
)>0
order by cont.contest_id