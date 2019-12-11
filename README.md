# GMO Aozora Net Bank Open Api Java SDK

## About

GMOあおぞらネット銀行について

https://gmo-aozora.com/

GMOあおぞらネット銀行 API開発者ポータルについて

https://api.gmo-aozora.com/ganb/developer/

## Version

1.0

## Requirements

Java 1.7+

## Installation

- At first, [install Gradle](https://gradle.org/install/) on your local

- Generate the JAR by executing the following command

```shell
gradle build
```

- Specify classpath in the following JARs when compiling your project

`build/libs/gmo-aozora-api-java-1.0-SNAPSHOT.jar`

## Getting Started

###  Enviroment

- stg

    [StringConfig.java](src/main/java/common/StringConfig.java)

    ```java
    public static final String ISSUER = StringConfig.STG_ISSUER;
    public static final String BASE_ENDPOINT = StringConfig.STG_BASE_ENDPOINT;
    ```

- prod

    [StringConfig.java](src/main/java/common/StringConfig.java)

    ```java
    public static final String ISSUER = StringConfig.PROD_ISSUER;
    public static final String BASE_ENDPOINT = StringConfig.PROD_BASE_ENDPOINT;
    ```

## Documentation

 - [Authorization](docs/authorization)
 - [Corporate](docs/corporate)
 - [Personal](docs/personal)
 - [Webhook](docs/webhook)

## Autor

GMO Aozora Net Bank, Ltd. (open-api@gmo-aozora.com)

## Licence

[MIT](https://github.com/gmoaozora/gmo-aozora-api-java/blob/master/LICENSE)