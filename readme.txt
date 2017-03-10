# https://www.mkyong.com/gradle/gradle-create-java-project-structure-automatically/
gradle init --type groovy-library

#http://www.marcelustrojahn.com/2015/11/spring-boot-groovy-mvc-hello-world-example/

groovy KKMultiServer.groovy 5000


gradle assemble

set KKSERVER_PORT=4000
java -jar build\libs\KKMultiServerBoot.jar

java -jar -Dkkserver.port=3000 build\libs\KKMultiServerBoot.jar