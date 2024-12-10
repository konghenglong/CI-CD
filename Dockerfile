FROM openjdk:21-slim

ARG DEPLOY_DIR=/home/deployment/jar

RUN mkdir -p ${DEPLOY_DIR}

COPY target/*.jar ${DEPLOY_DIR}/app.jar

WORKDIR ${DEPLOY_DIR}

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]