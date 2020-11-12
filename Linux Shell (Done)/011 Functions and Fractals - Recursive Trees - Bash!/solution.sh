#!/bin/bash
read n

Hi=63 #don't realy need it just 
La=100
TXT=''
X=1  #langueur
Z=0  #Start
Y=0  #Largeur
for (( x=1 ; x <= (6-$n) ; x++ ))
do
    X=$(($X*2))
    Z=$((($X/2)+$Z))
done
    Y=$(($X/2))
#creation des lignes vide
for (( line=1; line <= $Z ; line++))
do
        chars=''
    #for char in {1..100}
    for (( char=1 ; char <= $La ; char++ ))
    do
        chars=$chars'_'
    done
        echo $chars
done 
#itération des niveaux
for (( itr=1 ; itr <= $n ; n--))
do
         X=1  #langueur Y
         Z=0  #Start position for first 1
         Y=0  #Largeur (1/2 langueur)
         z=1
         a=16
         b=1  #nombre des extrimitée Y
     for (( x=1 ; x <= (6-$n) ; x++ ))
     do
         X=$(($X*2))
         #Z=$((($X/2)+$Z))
     done
         Y=$(($X/2))
     
     for (( x=1 ; x <= $n ; x++ ))
     do
         b=$(($b*2))
         Z=$(($Z+$a))
         a=$(($a/2))
done
        Z=$((($La/2)-$Z))
T=' '
for (( i=0; i<$b ; i++ ))
do
    T=${T}$(($Z+($X*$i)))' '
done
    y=$(($Y+1))
    chaha=''
for (( line=1 ; line <=$X ; line++ ))
do
    
    if [ $line -gt $y ]
    then
        echo $chaha
    else
    
        chaha=''
    #for i in {1..100}
    for (( i=1 ; i <= $La ; i++ ))
    do
            s=$(($line -1))
       for M in $T
       do
          if [ $i -eq $(($M+$s)) ]
          then
              C='1'
          break
          else
              C='_'
          fi
             s=$(($s*-1))
    done
    chaha=$chaha$C
    done
    echo $chaha
    fi
done
done