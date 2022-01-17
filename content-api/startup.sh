#!/bin/sh
nohup java -jar ./target/training-1.0-SNAPSHOT.jar >> output.out 2>&1 &
echo $! > output.pid