# 🐳 Docker Setup & Guides

Package and run applications in isolated container environments.

---

## 🚀 Getting Started & CLI Setup
```bash
    docker build -t app:1.0 .  # Build image from local Dockerfile
    docker run -p 8080:80 app:1.0 # Run container forwarding port 8800
    docker compose up -d      # Launch compose services in background
    docker ps                 # List running docker containers
    docker system prune -a    # Delete all cached images/containers
```

---

## 📋 Core Reference Sheet

| File | Purpose | Key Directive |
| :--- | :--- | :--- |
| **Dockerfile** | Instructions to compile image | `FROM node:18-alpine` |
| **.dockerignore** | Ignores files from container context | `node_modules` |
| **docker-compose.yml** | Orchestrates multi-container apps | `services:` |


---

## 🔧 Recommended Setup
1. Download installer from the official website.
2. Follow standard setup configuration prompts.
3. Check the default environment PATH variables are set.

## 🤝 Contributing
Suggest configurations or integrations by editing this file. Read [CONTRIBUTING.md](../../CONTRIBUTING.md) for details.
