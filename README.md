# Error Prone REST Plugin

This is a plugin for [errorprone](https://errorprone.info/) for checking REST APIs and common issues with API systems, as well as to allow the engineers to play around with certain concepts that are beneficial in that space. 

Plans for this plugin include:

* JAX-RS patterns
* AIP patterns
* Taint checking and related patterns
* Various security patterns, especially relating to the [OWASP API Security Top 10](https://owasp.org/www-project-api-security/).

This is not an officially supported Google product, nor is it an official extension to Error Prone. This is 100% a side project.

## Building

In order to build the system, simply use the gradle wrapper:

```
./gradlew
```

This will build the system, run tests, enforce policies, etc.

## Source Code Headers

Every file containing source code must include copyright and license
information. This includes any JS/CSS files that you might be serving out to
browsers. (This is to help well-intentioned people avoid accidental copying that
doesn't comply with the license.)

This is the standard Apache header and can be found in `license_header.txt`. 