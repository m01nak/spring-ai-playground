FROM eclipse-temurin:17-jre
COPY target/*.jar moinak-spring-ai-playgroung.jar
ENTRYPOINT ["java","-jar","/moinak-spring-ai-playgroung.jar"]