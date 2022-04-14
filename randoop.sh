#!/bin/bash

function readfile ()
{
  for file in `ls $1`
  do
    if [ -d $1"/"$file ]
    then
      class=$2.$file
      readfile $1"/"$file $class
    else
      check_suffix $1 $file $class
   fi
  done
}


function check_suffix()
{
    path=$1
    base=$2
    class=$3
    outputdir=${class//.//}
    name=$(echo "$base" | cut -f 1 -d '.')
    if [ "${base##*.}"x = "class"x ];then
        echo $path/$base
        echo $name
        echo $class.$name
        echo $outputdir
        #change this dir
        #--testclass=$class.$name\
        #--classlist=testclass.txt \
        echo out/production/$rootpwd/.
        cp ./gen/tobetest.txt ./
        echo $class.$name>>tobetest.txt
        java -classpath out/production/$rootpwd/.:${RANDOOP_JAR} \
        randoop.main.Main gentests \
        --classlist=tobetest.txt \
        --output-limit=150 \
        --junit-output-dir=src/$outputdir \
        --regression-test-basename=Test$name \
        --junit-reflection-allowed=false \
        --randomseed=50 \
        --no-regression-assertions=true

        echo src/$outputdir/.
        javac -cp lib/randoop-4.3.0.jar:lib/junit-4.12.jar:src/$outputdir/.:src/.  src/$outputdir/Test${name}Driver.java
        java -cp lib/randoop-4.3.0.jar:lib/junit-4.12.jar:src/$outputdir/.:src/.:src/.:$DAIKONDIR/daikon.jar daikon.DynComp -f Test${name}Driver.decls-DynComp Test${name}Driver
        java -cp lib/randoop-4.3.0.jar:lib/junit-4.12.jar:src/$outputdir/.:src/.:src/.:$DAIKONDIR/daikon.jar daikon.Chicory  --comparability-file=Test${name}Driver.decls-DynComp Test${name}Driver
        java -cp lib/randoop-4.3.0.jar:lib/junit-4.12.jar:src/$outputdir/.:src/.:src/.:$DAIKONDIR/daikon.jar daikon.Daikon Test${name}Driver.dtrace.gz
        java -cp lib/randoop-4.3.0.jar:lib/junit-4.12.jar:src/$outputdir/.:src/.:src/.:$DAIKONDIR/daikon.jar daikon.tools.jtb.Annotate Test${name}Driver.inv.gz src/$outputdir/$name.java

        rm -rf Test${name}Driver.decls-DynComp
        rm -rf Test${name}Driver.dtrace.gz
        rm -rf Test${name}Driver.inv.gz
        rm -rf src/$outputdir/Test${name}Driver.java
        rm -rf src/$outputdir/Test${name}Driver.class
        rm -rf tobetest.txt
    fi
}

rootpwd=${PWD##*/}
folder="./out/production/$rootpwd/com"
class="com"
readfile $folder $class    