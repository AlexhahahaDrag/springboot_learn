整合swagger2.10.5和之前的版本不同，spring5引用WebFlux框架，异步非阻塞式web框架
WebFlux 并不能使接口的响应时间缩短，它仅仅能够提升吞吐量和伸缩性。
由@EnableSwagger2变成@EnableSwagger2WebMvc,@EnableSwagger2WebFlux
依赖有之前的两个变成现在的三个
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.10.5</version>
</dependency>
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.10.5</version>
</dependency>
<!--     <dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-spring-webflux</artifactId>
    <version>2.10.5</version>
</dependency>-->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-spring-webmvc</artifactId>
    <version>2.10.5</version>
</dependency>