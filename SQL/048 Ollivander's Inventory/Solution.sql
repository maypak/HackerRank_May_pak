SELECT t2.id,t1.age,t1.c,t1.power

from

(SELECT ww.id,wpp.age,ww.coins_needed,ww.power from wands ww inner join wands_property wpp on ww.code = wpp.code and wpp.is_evil=0) AS T2

inner join

(SELECT wp.age,min(w.coins_needed) c,w.power from wands w inner join wands_property wp on w.code = wp.code group by wp.age,w.power) AS T1

WHERE t2.age = t1.age and t2.power = t1.power and t2.coins_needed = t1.c order by t1.power desc ,t1.age desc;