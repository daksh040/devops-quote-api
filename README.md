# Quote API — DevOps Project

A Java Spring Boot API used to demonstrate a DevOps pipeline.

## Endpoints

- GET / — project welcome message
- GET /quote — returns a random quote
- GET /health — returns the application health status

## Planned pipeline

Git → Maven → Jenkins → Docker → Kubernetes

Ansible will automate server configuration and application setup.

Jenkins automatically tests and builds changes pushed to main.
