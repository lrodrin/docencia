# Docker

## Requirements

```bash
sudo apt install docker.io
```

## Usage
To run the server on a Docker container, please execute the following from the root directory:

```bash
# building the image
docker build -t swagger_server .

# starting up the container
docker run -it swagger_server
```
