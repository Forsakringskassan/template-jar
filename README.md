# JAR Template

This is a template repository for Java projects. The idea is to copy this repository when creating new Java projects.

## Gradle

This repository also has the `se.fk.gradle.bundle-jar` plugin from [gradle-conventions](https://github.com/Forsakringskassan/gradle-conventions).

## Release

Release is triggered by Gradle, it will push a tag that triggers the NPM release: <https://github.com/Forsakringskassan/template-jar/actions/workflows/gradle-release.yaml>

The release will publish:

- Maven artefact: <https://github.com/orgs/Forsakringskassan/packages?repo_name=template-jar>
