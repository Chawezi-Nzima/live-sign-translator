---
name: deployment
description: Deployment and packaging guidelines.
---

# Purpose

Define deployment processes for all system components.

## Components

- JavaFX Desktop Application
- FastAPI Backend
- ML Inference Service
- Supabase

## Development Environment

- Java 21
- Python 3.12+
- Maven
- Virtual Environments

## Packaging Strategy

### Frontend

- Use jpackage
- Generate platform-specific installers

### Backend

- Use Docker containers

### ML Services

- Package models separately
- Version all models

## Environment Variables

```text
SUPABASE_URL=
SUPABASE_KEY=
JWT_SECRET=
MODEL_PATH=
```

## CI/CD Requirements

- Run automated tests
- Validate builds
- Generate release artifacts
- Verify environment variables

## Release Checklist

- Tests pass
- Security review completed
- Documentation updated
- Models versioned
- Environment variables configured

## Deployment Rules

- Never commit secrets.
- Use environment variables.
- Automate deployment processes.
- Ensure reproducible builds.