
# Building a Robust API Test Automation Framework with RestAssured

This template outlines the step-by-step process for building the framework using RestAssured, including code snippets and examples.



## What is Rest Assured framework?
RestAssured Framework is an Open-source Java-based framework used by programmers and developers for testing and validating REST services. RestAssured Framework provides a Domain-Specific Language (DSL) to create and write powerful tests for RESTful APIs efficiently.

With RestAssured Framework, Automation Testing professionals can create customized and user-friendly HTTP requests that can be used to test RESTful Web Services. This helps in testing a variety of request combinations with respect to the business logic layer of applications. Fetching data is easy, regardless of the complexity of JSON structures, because REST Assured simplifies the validation process for users with human-readable results.
## Technologies Used

**Programming language:** Java

**Build tool:** Maven

**Java Library:** Rest Assured

**IDE:** Intellij Idea
## Dependencies Used-

Rest Assured

```bash
        <dependency>
                <groupId>io.rest-assured</groupId>
                <artifactId>rest-assured</artifactId>
                <version>5.3.0</version>
            </dependency>
```
Apache poi

```bash
 
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi</artifactId>
            <version>5.0.0</version>
        </dependency>
```

Apache poi-ooxml

```bash
         <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml</artifactId>
            <version>5.0.0</version>
            <scope>test</scope>
        </dependency>
```
Extent Report

```bash
<dependency>
            <groupId>com.aventstack</groupId>
            <artifactId>extentreports</artifactId>
            <version>5.0.9</version>
        </dependency>
 ```
TestNG

```bash
          <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.5</version>
          </dependency>
```

## Steps for Execution

1. Clone or Download the repository in your System

2. Open the project in any IDE which run maven project

3. Go to project and run testng.xml file

4. Report will be generated in the Reports folder.
