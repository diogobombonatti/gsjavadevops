FROM openjdk:17-jdk-slim

WORKDIR /app

ARG JAR_FILE=target/*.jar
ARG USERNAME=myuser

COPY ${JAR_FILE} app.jar

RUN useradd -ms /bin/bash ${USERNAME} && chown -R ${USERNAME} /app

USER ${USERNAME}

ENV JAVA_OPTS="-Xms512m -Xmx1024m"

ENTRYPOINT ["java", "-jar", "app.jar"]
