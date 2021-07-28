FROM openjdk:11
MAINTAINER Gabriel Pedrico
WORKDIR transacao
EXPOSE 8080
ADD target/*.jar /gabrielpedrico/transacao.jar
ENTRYPOINT ["java","-jar","transacao.jar"]