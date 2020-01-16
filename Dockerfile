FROM adoptopenjdk:8-jdk-hotspot

WORKDIR /app
RUN sed -i '/^deb/s#[^/]*ubuntu.com#mirrors.aliyun.com#' /etc/apt/sources.list
RUN apt update && apt install -y vim telnet unzip && curl -L https://arthas.gitee.io/install.sh | sh

COPY release/simple-web.jar /app
COPY application.properties /app/conf/application.properties
COPY run.sh /app

EXPOSE 8080

ENTRYPOINT ["sh", "-c", "/app/run.sh"]

