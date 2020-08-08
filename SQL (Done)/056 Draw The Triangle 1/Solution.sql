/*
* With procedure
*/

DROP PROCEDURE IF EXISTS TRIANGLE;
delimiter #
CREATE PROCEDURE TRIANGLE()
BEGIN
DECLARE i INT DEFAULT 0;
SET i=20;
WHILE i>0 DO
    SELECT REPEAT('* ',i);
    SET i=i-1;
END WHILE;
END#
delimiter ;
CALL TRIANGLE();

/*
* SELECT
*/

select
    lpad('',n.n*2,'* ')
from (
    select
        ones.n + tens.n*10 as n
    from
        (select 1 as n union select 2 union select 3 union
		 select 4 union select 5 union select 6 union select 7 union
		 select 8 union select 9 union select 10) ones
    inner join
        (select 0 as n union select 1) tens
    on
        true
    order by
        n desc
) n;