

# fun-in-Quarantine

 [![Build Status](https://travis-ci.com/ariadnimac/fun-in-Quarantine.svg?token=ghcacf6iv5VcjeSKztqj&branch=development)](https://travis-ci.com/ariadnimac/fun-in-Quarantine)  [![codecov](https://codecov.io/gh/ariadnimac/fun-in-Quarantine/branch/development/graph/badge.svg?token=AQioBsON9h)](https://codecov.io/gh/ariadnimac/fun-in-Quarantine)

An assignment created during the 2020 covid-19 quarantine

This repository serves the purpose of completing the tasks and projects given. 

This repository consists of:

1. A parent Maven Project: **seip2020_practical_assignments**
2. A child Maven Project: **histogramgenerator** that generates a histogram from a given .txt file that stores the grades that is being given as an argument through the command line.
3. A child Maven Project: **unittesting** that demonstrates the  

## Getting Started

Please note that the project was written in Java JDK 1.8 and built with Maven 3.6.3

## Downloading

To download the project on your computer you must download the zip file or clone the repository on your computer.

## Building

Execute the following command in the repository root directory in order to build the project.

```sh
mvn clean install jacoco:report
```

Running this command will also generate a report of the code coverage produced by JaCoCo. The report will be located in the following path for each module:

```sh
mvn clean install jacoco:report
```
## Testing

Execute the following command in the repository root directory in order to run the unit tests.

```sh
mvn test
```
To generate a test coverage report run the command
```sh
mvn test jacoco:report
```
## Travis CI
This project uses the services of Tracis CI to ensure that everytime a git-push is executed the project is tested and built correctly. 


  