FROM java:8
ADD payment-1.0.0.jar //
ENTRYPOINT ["java", "-Dfile.encoding=utf-8","-jar", "/payment-1.0.0.jar"]