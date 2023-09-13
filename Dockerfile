FROM eclipse-temurin:17-jdk-jammy


COPY /JavaPart /usr/app/Java
COPY ./docker.entrypoint.sh /usr/app/Java

WORKDIR /usr/app/Java

RUN chmod +x docker.entrypoint.sh

ENTRYPOINT [ "./docker.entrypoint.sh" ]