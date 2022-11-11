FROM openjdk:8-jdk-alpine
MAINTAINER rinahariyanti <rinayanti1771@gmail.com>
RUN mkdir -p /app
WORKDIR /app

COPY Dua.java /app

#compile file java
RUN javac Dua.java

#running java
CMD ["java","Dua"]
