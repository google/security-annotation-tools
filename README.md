# Tools for API Security By Design

A set of related tools for building API systems that facilitate security by
design.

This is an **experimental** set of tools to demonstrate and prove out concepts
and are not meant to be used in production systems at this time.

This project attempts to differentiate between three forms of security:

1. Security by **Configuration**. What configuration elements need to be set up
   to provide security? For example, what ports do we need to block, how can we
   quickly respond when a security vulnerability is detected in a library, etc.
2. Security by **Observation**. How can we know that our system is secure? How
   will we know if the system suddely becomes no longer secure at some point in
   the future? For example, if accessing a file creates an audit log that can be
   responded to, can the system detect when it is under a DDoS attack, etc.
3. Security by **Design**. What steps can we take to ensure that certain
   categories of attack are rendered entirely irrelevant? For example, security
   type systems, sandboxing, etc.

Most systems include elements of all three (and this is no exception). For
example, a tool like Apigee Sense will detect bot traffic (Security by
Observation) and then a tool will be configured to block traffic coming from
malicious sources.

In this case, the goal is to prove out and focus on concepts around the _design_
aspects first and foremost.

## Security Annotations

Security annotations are at the core of how this project functions. The basic
concept behind security annotations is having a consistent, clear way to mark
the data that a system handles based on its type and level of sensitivity.

These markers can then be handled using a variety of mechanisms to allow for:

-   Dynamic enforcement
-   Static analysis
-   Type propagation across system boundaries

Documentation on how these work is forthcoming.

## Building

In order to build the system, simply use the gradle wrapper:

```bash
./gradlew build
```

This will build the system, run tests, enforce policies, etc.

### A Note on Spotless

The tools for managing formats through `prettier`, `ktlint`, and
`google-java-format` are not completely in sync with the settings for most IDEs
and getting them completely in sync is prohibitively difficult across many
different environments. To facilitate making sure things stay consistent, common
types are managed using gradle.

To keep things running smoothly and consistently formatted, use:

```bash
./gradlew spotlessApply
```

Don't worry about forgetting, the system will keep you honest, but if it is
yelling at you after saving in some system or another, this is likely both why
along with how to fix it.

## Source Code Headers

Every file containing source code must include copyright and license
information. This includes any JS/CSS files that you might be serving out to
browsers. (This is to help well-intentioned people avoid accidental copying that
doesn't comply with the license.)

This is the standard Apache header and can be found in `license_header.txt`.
