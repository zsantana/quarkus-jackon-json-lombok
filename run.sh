mvn clean package
java -Xmx256M -XX:+UseZGC -XX:ActiveProcessorCount=2 -XX:+UseStringDeduplication -jar target/quarkus-app/quarkus-run.jar