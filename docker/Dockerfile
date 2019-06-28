
# Docker container for running nginx

FROM ubuntu:16.04
MAINTAINER Laura Rodriguez-Navas (laura.rodriguez@cttc.cat)
RUN apt-get update
RUN apt-get install -y nginx
ENTRYPOINT ["/usr/sbin/nginx", "-g", "daemon off;"]
EXPOSE 80
