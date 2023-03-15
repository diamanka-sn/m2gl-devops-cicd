FROM openjdk:8
EXPOSE 8080
ADD target/m2gl-devops-pipeline-ci-cd.jar m2gl-devops-pipeline-ci-cd.jar
ENTRYPOINT [ "java","-jar", "/m2gl-devops-pipeline-ci-cd.jar" ]