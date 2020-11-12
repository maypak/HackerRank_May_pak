while read line
do
    echo "$line" | cut -d " " -f 4
done