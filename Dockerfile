FROM openjdk
COPY /target/devops_calculator-1.0-SNAPSHOT.jar /home/devops_calculator-1.0-SNAPSHOT.jar
CMD ["java" , "-jar" , "/home/devops_calculator-1.0-SNAPSHOT.jar"]

