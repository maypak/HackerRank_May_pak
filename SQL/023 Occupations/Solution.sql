SELECT
    GROUP_CONCAT(if(Occupation = 'Doctor', Name, NULL)) AS 'Doctor', 
    GROUP_CONCAT(if(Occupation = 'Professor', Name, NULL)) AS 'Professor', 
    GROUP_CONCAT(if(Occupation = 'Singer', Name, NULL)) AS 'Singer', 
    GROUP_CONCAT(if(Occupation = 'Actor', Name, NULL)) AS 'Actor'
FROM
(
    SELECT a.*,
        (CASE @vOccup WHEN a.OCCUPATION THEN @rownum:=@rownum+1 ELSE @rownum:=1 END) rnum,
        (@vOccup:=a.OCCUPATION) vOccup
    FROM OCCUPATIONS a,(SELECT @vOccup:='', @rownum:=0 FROM DUAL) b
    ORDER BY OCCUPATION, NAME ) c
GROUP BY c.rnum

-- 출처: https://mia-dahae.tistory.com/82