Juice RestClient
----------------------------------------------

[![GitHub](https://github.com/josdem/juice-restclient/actions/workflows/main.yml/badge.svg)](https://github.com/josdem/juice-restclient/actions)

This project shows how to test an API using [RestClient](https://spring.io/blog/2023/07/13/new-in-spring-6-1-restclient) with [Junit Jupiter](https://junit.org/junit5/docs/current/user-guide/)

#### To run tests

```bash
gradle test
```

#### To run a single test

```bash
gradle test --tests ${testName}
```

where:
- `${testName}` is your test name

#### Read this as reference:
- https://josdem.io/techtalk/java/junit5/