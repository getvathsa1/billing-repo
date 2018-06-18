FROM java:8-jre

USER root

ADD ./target/Billing-0.1-SNAPSHOT.jar /opt/Billing-0.1-SNAPSHOT.jar
CMD ["java", "-Xmx200m", "-jar", "/opt/Billing-0.1-SNAPSHOT.jar"]

EXPOSE 8080

