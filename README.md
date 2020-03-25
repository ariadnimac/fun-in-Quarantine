# fun-in-Quarantine
An assignment created during the 2020 covid-19 quarantine

This repository serves the purpose of completing the tasks and projects given. 

This repository consists of:

1. A parent Maven Project named:"seip2020_practical_assignments"
2. A child Maven Project of the former mantioned named:"histogramgenerator" that generates a histogram from a given .txt file that stores the grades that is being given as an argument through the command line.

## Getting Started

Please note that the project was written in Java JDK 1.8 and built with Maven 3.6.3

**Downloading**

To download the project on your computer you must download the zip file or clone the repository on your computer.

**Building** 

Execute the following command in the repository root directory in order to build the project.

```sh
mvn package
```

**Running** 

To run the project with the file of your preferance you must run the following command in the target file of the child project.

```sh
java -jar histogramgenerator-SNAPDHOT-0.0.1-jat-with-dependencies.jar -the path to your file
```