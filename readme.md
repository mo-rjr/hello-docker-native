# hello-docker-native

A very simple Java program, 
so that I can concentrate on getting it built to a native executable 
and running in a Docker container

## creation
These commands should all be run from the root.
Also they require an environment with GraalVM native and Docker.

To package as a normal fat jar, run:  
`mvn clean package`

To package as a native executable, run:  
`mvn package -Pnative`

To build a docker container, run:  
`docker build -t tick-tock .`

You can run that docker container with:  
`docker run tick-tock`