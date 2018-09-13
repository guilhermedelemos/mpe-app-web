#!/bin/bash
java -Dgrails.env=prod -jar build/libs/MPEAppWeb-0.1.war -server -Xmx768M -XX:MaxPermSize=256m
