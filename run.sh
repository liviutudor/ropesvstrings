#!/bin/bash

# Simple script to run mvn exec:java a few times
# in order to allow for jvm warmups etc.

export MAVEN_OPTS="-Xms512m -Xmx512m"

for i in {1..5}
do
    echo "-----------------"
    echo "Execution $i"
    mvn exec:java
done
