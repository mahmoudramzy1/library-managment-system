FROM maven:3.6.3-openjdk-8 AS maven_build

COPY pom.xml /usr/app/

COPY target/librarymanagementsystem-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app/

ENTRYPOINT [ "java" , "-jar" , "librarymanagementsystem-0.0.1-SNAPSHOT.jar"]

EXPOSE 8081


COPY --from=maven_build ../target/librarymanagementsystem-0.0.1-SNAPSHOT.jar /usr/app/librarymanagementsystem-0.0.1-SNAPSHOT.jar

CMD java -jar ../tmp/librarymanagementsystem-0.0.1-SNAPSHOT.jar