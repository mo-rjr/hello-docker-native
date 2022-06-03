# syntax=docker/dockerfile:1

FROM ubuntu

# copy the executable
COPY target/tick-tock .

# make it executable
RUN chmod +x tick-tock

# start the executable
# CMD ["./tick-tock"]
ENTRYPOINT ["./tick-tock"]