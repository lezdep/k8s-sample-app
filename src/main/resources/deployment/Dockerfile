#FROM anapsix/alpine-java
FROM openjdk:8

ADD target/scala-2.11/k8s-sample-app-assembly-0.1.jar /

# com.ethoca.estreams.ingest.EthocaStreamsAlertProducer
CMD java -jar /k8s-sample-app-assembly-0.1.jar
