


https://www.mkyong.com/maven/maven-how-to-create-a-multi-module-project/
https://www.baeldung.com/maven-multi-module

https://medium.com/omarelgabrys-blog/microservices-with-spring-boot-intro-to-microservices-part-1-c0d24cd422c3
https://medium.com/omarelgabrys-blog/microservices-with-spring-boot-creating-our-microserivces-gateway-part-2-31f8aa6b215b


mvn spring-boot:run -Drun.jvmArguments="-Dserver.port=8300"

mvn spring-boot:run -Drun.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=8787 -Dserver.port=9090 -Dpath.to.config.dir=/var/data/my/config/dir"
