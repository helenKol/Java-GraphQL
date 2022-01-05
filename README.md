## Dependencies
- Java
- Gradle
- RestAssured
- GraphQL codegen
- Allure
- Lombok
- OWNER Java™ properties reinvented

## Preparation before run
1. In properties file {project_folder}/src/main/resources/config.properties needs to select the logging mode:
- to turn on: ```logEnabled=true```
- to turn off: ```logEnabled=false```

## How to run
1. Open a terminal or command line
2. Remove previous allure-results (it they exist) to prevent results mixing (optional)
   ```Gradle tasks -> build -> clean```
3. Validate the project (mandatory only the first time launch and after code changes):
   ```Gradle tasks -> build -> assemble```
4. Run tests:
   ```Gradle tasks -> verification -> test```
5. Execute the command to generate Allure report:
   ```Gradle tasks -> other -> allureReport```
   ```Gradle tasks -> other -> allureServe```

## Properties in BaseConfig
- *dev.apiUrl* - url of API
- *logEnabled* - boolean flag to manage logging mode
