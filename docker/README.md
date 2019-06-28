# Docker

## Requirements

```bash
sudo apt install docker.io
```

## Usage
To run the server on a Docker container, please execute the following from the root directory:

```bash
# building the image
docker build -t test .

# starting up the container
docker run -d -p 80:80 --name webserver test
```
and open your browser to here:
```
http://localhost:80/
```
