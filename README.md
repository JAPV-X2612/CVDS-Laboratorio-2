# Creating a Project with Maven

## Description

Laboratory 2 of the **Software Development and Lifecycle course (CVDS)**, focused on learning to use the **Maven tool** and **design patterns**.
---
## **Team Members**  

- **Jesús Alfonso Pinzón Vega**  
  **GitHub Username**: [JAPV-X2612](https://github.com/JAPV-X2612) (Owner)  

- **José David Castillo Rodríguez**  
  **GitHub Username**: [JoseDavidCastillo](https://github.com/JoseDavidCastillo) (Collaborator)  

- **Mayerlly Suárez Correa**  
  **GitHub Username**: [corrllr](https://github.com/corrllr) (Collaborator)  

---

## **Understanding the Maven Tool**  

### **What is its main utility?**  
Apart from being a Java project management tool, Maven's primary utility lies in its ability to manage project dependencies and automate the process of building, testing, and packaging code.  

### **Maven Phases**  

1. **Validate**: Verifies that the project is complete and all necessary information is available.  
2. **Compile**: Converts the source code into binary code.  
3. **Test**: Executes unit tests on the compiled code.  
4. **Package**: Packages the compiled code into a format like JAR or WAR.  
5. **Verify**: Performs additional checks to ensure everything works correctly and meets quality standards.  
6. **Install**: Places the package in the local repository for use as a dependency in other projects.  
7. **Deploy**: Copies the final package to a remote repository to share with other developers.  

### **Build Lifecycle**  

The build lifecycle represents a sequence of phases that manage different aspects of building and maintaining the software.  

1. **Default Lifecycle**  
   Covers the full project build process, including phases like **compile**, **test**, **package**, **install**, and **deploy**.  

2. **Clean Lifecycle**  
   Handles cleaning the project directory by removing files generated during earlier phases.  
   - **Phases**: **pre-clean**, **clean**, **post-clean**.  

3. **Site Lifecycle**  
   Responsible for generating project-related documentation.  
   - **Phases**: **pre-site**, **site**, **post-site**.  

### **What are Maven plugins used for?**  

Maven plugins are components that perform specific tasks during the build process. Examples include:  

- **maven-compiler-plugin**: Compiles the project's source code.  
- **maven-jar-plugin**: Generates the project's JAR file.  
- **maven-site-plugin**: Creates project documentation.  
- **maven-surefire-plugin**: Runs the project's unit tests.  

### **What is the Maven Central Repository, and what is it used for?**  

The Maven Central Repository is a public repository where Maven retrieves the libraries and dependencies needed for a project. Developers can declare dependencies in the `pom.xml` file, and Maven automatically downloads them, along with their transitive dependencies, from this central repository. This simplifies dependency management and ensures consistent builds across environments.




## Features

- Feature 1
- Feature 2
- Feature 3
- ...

## Installation

### Prerequisites

List any prerequisites that are needed to run the project (e.g., specific software, libraries, or dependencies).

```bash
# Example for Java
java -version



mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.shapes.ShapeMain" -Dexec.args="Hexagon"
