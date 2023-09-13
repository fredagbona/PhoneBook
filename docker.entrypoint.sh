#!/bin/bash

echo "Starting..."

rm *.class
javac -d /usr/app/out Main.java

cp /usr/app/Java/data.txt /usr/app/out

cd /usr/app/out

echo "Run..."

java Main
