FROM eclipse-temurin:17-jre-alpine

RUN addgroup -S app && adduser -S app -G app
WORKDIR /app

COPY target/Webform.jar Webform.jar

ENV JAVA_OPTS="-XX:MaxRAMPercentage=75 -XX:InitialRAMPercentage=25"

EXPOSE 8080

USER app

ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar Webform.jar"]