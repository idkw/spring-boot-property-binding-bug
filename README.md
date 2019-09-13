# Issue with spring boot property binding


## Context 

Spring boot provided relaxed property binding as specified [here](https://github.com/spring-projects/spring-boot/wiki/Relaxed-Binding-2.0) : 

In my understanding if I have two properties : 

```bash
kebab-case.property.value=unchanged
kebab-andCamelCase.property.value=unchanged
```

I should be able to overwrite them by passing environment variables such as : 

```bash
KEBABCASE_PROPERTY_VALUE="changed"
KEBABANDCAMELCASE_PROPERTY_VALUE="changed"
```

However only the first property gets overriden. The second property with mixed kebab and camel case does not get overriden.


## Reproduction

Check the test in DemoApplicationTests.java

In my understanding, the test should pass

```
export KEBABCASE_PROPERTY_VALUE="changed"
export KEBABANDCAMELCASE_PROPERTY_VALUE="changed"
mvn test
``` 

But it fails on the second property not getting overriden by the environment variable
