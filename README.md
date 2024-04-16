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

### To publish library to artifactory using Gradle

```bash
export ARTIFACTORY_USER=${username}
export ARTIFACTORY_PASSWORD=${password}
gradle publish
```
where:

- `${username}` Is artifactory username
- `${password}` Is artifactory password

**Note:** If you want to learn more and publish your own library, feel free to drop me a message on my home page website and ask for a Jfrog credentials.

### To publish library to artifactory using Maven

```bash
mvn deploy
```

Make sure you setup your artifactory credentials in `${USER_HOME}/.m2/settings.xml`

```xml
<settings>
    <servers>
        <server>
            <username>${username}</username>
            <password>${password}</password>
            <id>snapshots</id>
        </server>
    </servers>
</settings>
```
where:

- `${username}` Is artifactory username
- `${password}` Is artifactory password

#### Read this as reference:
- https://josdem.io/techtalk/java/junit5/