SELECT MIN(CITY), MIN(LENGTH(CITY)) FROM STATION WHERE LENGTH(CITY)IN(SELECT MIN(LENGTH(CITY)) FROM STATION);

SELECT MIN(CITY), MAX(LENGTH(CITY)) FROM STATION WHERE LENGTH(CITY)IN(SELECT MAX(LENGTH(CITY)) FROM STATION);