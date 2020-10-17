#!/usr/bin/env bash

mvn clean package

echo 'Copy files...'

scp -i ~/.ssh/id_rsa \
    target/imageserver-0.0.1-SNAPSHOT.jar \
    mrch@192.168.2.103:/home/mrch/

echo 'Restart server...'

ssh -i ~/.ssh/id_rsa mrch@192.168.2.103 << EOF
pgrep java | xargs kill -9
nohup java -jar imageserver-0.0.1-SNAPSHOT.jar > log.txt &
EOF

echo 'Bye'