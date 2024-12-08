# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.3.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.3.1/maven-plugin/reference/html/#build-image)
* [Docker Compose Support](https://docs.spring.io/spring-boot/docs/3.3.1/reference/htmlsingle/index.html#features.docker-compose)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.3.1/reference/htmlsingle/index.html#web)
* [Spring Web Services](https://docs.spring.io/spring-boot/docs/3.3.1/reference/htmlsingle/index.html#io.webservices)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/docs/3.3.1/reference/htmlsingle/index.html#web.reactive)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.3.1/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Spring Security](https://docs.spring.io/spring-boot/docs/3.3.1/reference/htmlsingle/index.html#web.security)
* [Okta Spring Boot documentation](https://github.com/okta/okta-spring-boot#readme)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.3.1/reference/htmlsingle/index.html#actuator)
* [Cloud Bootstrap](https://docs.spring.io/spring-cloud-commons/docs/current/reference/html/)
* [Config Server](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_spring_cloud_config_server)
* [Validation](https://docs.spring.io/spring-boot/docs/3.3.1/reference/htmlsingle/index.html#io.validation)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/3.3.1/reference/htmlsingle/index.html#data.nosql.mongodb)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)
* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Okta-Hosted Login Page Example](https://github.com/okta/samples-java-spring/tree/master/okta-hosted-login)
* [Custom Login Page Example](https://github.com/okta/samples-java-spring/tree/master/custom-login)
* [Okta Spring Security Resource Server Example](https://github.com/okta/samples-java-spring/tree/master/resource-server)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Centralized Configuration](https://spring.io/guides/gs/centralized-configuration/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)

## OAuth 2.0 and OIDC with Okta

If you don't have a free Okta developer account, you can create one with [the Okta CLI](https://cli.okta.com):

```bash
$ okta register
```

Then, register your Spring Boot app on Okta using:

```bash
$ okta apps create
```

Select **Web** > **Okta Spring Boot Starter** and accept the default redirect URIs.

### Docker Compose support
This project contains a Docker Compose file named `compose.yaml`.
In this file, the following services have been defined:

* mongodb: [`mongo:latest`](https://hub.docker.com/_/mongo)

Please review the tags of the used images and set them to the same as you're running in production.

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

