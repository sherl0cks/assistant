# Open Innovation Labs Assistant

The goal of this project to practice Domain Driven Design concepts with a use case that has the potential to help those learning Labs practices to apply them on real residencies. 

Apart from giving us a use case to build an app for, here is how the Assistant could help Labs practitioners (phrased in terms of Impact Mapping, and prioritized in order how we would build the features):

1) Reduce the amount of time required for practitioners to discover a practice that is useful for their residency by providing tailored recommendations based on the answer to a few simple questions.  
2) Reduce the amount of energy to build a schedule for week 1 of a residency by building an agenda based on a few simple questions, as well as the agendas used by previous team members.

## Practice Library

We should expect the [Practice Library](https://rht-labs.github.io/practice-library/)  to continue to grow in size, as it should. Thus, a simple mechanism to quickly direct practitioners to the right practice is in order. One way to do that is tailored navigation in the library itself, but we're taking this approach for now as we need a use case to write Java code against. This idea does not eliminate the option to add better navigation to the practice library.


## Local Usage

Prerequsites:

* JDK 8
* A modern maven 3.x 
* IDE like eclipse or intellij

To build the app locally:

``` 
[assistant]$ mvn clean install
```

To run the app locally after building it:

```
[assistant]$ cd assistant-adapters
[assistant-adapters]$ mvn spring-boot:run
```

The app will deploy to [http://localhost:8080](http://localhost:8080), which will redirect you to the embedded [Swagger UI](https://swagger.io/swagger-ui/).


## OpenShift Usage: Sandbox

To run the app in your personal sandbox project in OpenShift.

``` 
[assistant]$ oc login 
[assistant]$ oc new-project MY_PROJECT_NAME
[assistant]$ mvn clean fabric8:deploy -Popenshift
```

You can also run the integration tests that will deploy to your current OpenShift project

```
[assistant]$ oc login 
[assistant]$ mvn clean verify -Popenshift,openshift-it

```

## OpenShift Usage: Pipeline

TODO: provide info on applier

## IDE Setup

To enable Hot Swap when using `spring-boot:run`, see [this thread](https://stackoverflow.com/questions/23155244/spring-boot-hotswap-with-intellij-ide).

## Stuff Not In The Original Booster

This is [the original booster](https://github.com/snowdrop/spring-boot-http-booster), provisioned via [http://launch.openshift.io](http://launch.openshift.io).

- CORS filter
- Swagger UI
- Swagger Spec gen (there is an option to make this the new v3 OpenAPI Spec if preferred)
- maven multimodule support
- [doc fixes](https://github.com/snowdrop/spring-boot-http-booster/issues/74)
- [spring boot parent pom stupidity fixes](https://github.com/snowdrop/spring-boot-booster-parent/issues/7)

## More Information
You can learn more about this booster and rest of the Spring Boot runtime in the link:http://appdev.openshift.io/docs/spring-boot-runtime.html[Spring Boot Runtime Guide].