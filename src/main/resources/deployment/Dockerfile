#FROM anapsix/alpine-java
FROM openjdk:8

ADD target/scala-2.11/k8s-sample-app_2.11-0.1.jar /

# com.ethoca.estreams.ingest.EthocaStreamsAlertProducer
CMD java -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=$INGESTION_JMX_PORT -Dcom.sun.management.jmxremote.local.only=false -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -jar /k8s-sample-app_2.11-0.1.jar
