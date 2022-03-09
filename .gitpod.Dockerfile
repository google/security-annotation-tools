FROM gitpod/workspace-full

USER gitpod

RUN brew install google-java-format
RUN brew install ktlint
