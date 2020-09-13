read x
read y

if [ $x -gt $y ]
then
    comp="greater than"

elif [ $x -lt $y ]
then
    comp="less than"

else
    comp="equal to"
fi

echo "X is $comp Y"