#!/bin/sh
set -x

java -jar simple-web.jar --spring.config.location=/app/conf/application.properties
