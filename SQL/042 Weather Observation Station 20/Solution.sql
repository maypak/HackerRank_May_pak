SET @rowindex := -1;
 
SELECT
   round(AVG(lat.lat_n),4)
FROM
   (SELECT @rowindex:=@rowindex + 1 AS rowindex,
    station.lat_n as lat_n
    FROM station
    ORDER BY station.lat_n) AS lat
WHERE
lat.rowindex IN (FLOOR(@rowindex / 2) , CEIL(@rowindex / 2));