# Introduction

Multi-module  project for spring boot with supporting cloud environment and data bases.

This project was created in order to quick start

## Comparability

Gradle 4.4 and Java 1.8

* Spring Boot 2.1.0
* Spring cloud Services
    * Cloud Foundry (Pivotal Cloud Foundry, SAP)
    * Amazon
* Jpa
    * MySQL
    * PostgreSQL
    * Oracle
    * MongoDB
    * redis

## Environment variables

If you want to connect customly you have to set the following variables.

| Name of environment | Description |
| ------------------- | ----------- |
| SERVER_PORT         | This is port which server will listen |
| CUSTOM_PROFILE      | If you are not in Cloud Foundry environment, you should choose this one (mysql, postgre, oracle, mongodb) and set the next. In default Application use H2 database |
| HOSTNAME_DB         | URL database, default: localhost |
| PORT_DB             | The Port of DB, default port usual |
| USERNAME_DB         | login in default: none      |
| PASSWORD_DB         | Password, default: none |