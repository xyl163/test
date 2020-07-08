FROM java:8
ADD ./target/kzMall-payment-1.0-SNAPSHOT.jar kzMall-payment-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-Dfile.encoding=utf-8","-jar", "/payment-1.0.0.jar"]