---
name: api-integration
description: Standards for communication between JavaFX, FastAPI, ML services, and Supabase.
---

# Purpose

Define integration patterns and communication standards for the Live Sign Language Translator system.

## Architecture

```text
JavaFX Desktop Client
        ↓ HTTP/JSON
FastAPI Backend
        ↓
ML Inference Service
        ↓
Supabase
```

## Technology Stack

- Java 21
- JavaFX
- Python 3.12+
- FastAPI
- Pydantic
- Supabase

## Communication Rules

- Use REST APIs.
- Exchange data using JSON.
- Version APIs using `/api/v1/`.
- Keep endpoints stateless.
- Use HTTPS in production.
- Validate all requests and responses.

## API Standards

### Request Format

- JSON request bodies
- Camel case for JSON properties
- Input validation using Pydantic

### Response Format

```json
{
  "success": true,
  "data": {},
  "message": ""
}
```

### Error Format

```json
{
  "success": false,
  "error": "Description"
}
```

## Endpoint Categories

- Authentication
- User Profiles
- Gesture Recognition
- Translation History
- Settings

## Performance Guidelines

- Minimize payload size.
- Prefer landmark data over raw image frames.
- Compress large data when necessary.
- Keep API latency below 200 ms where possible.

## Security Requirements

- Validate JWT tokens.
- Enforce authorization rules.
- Sanitize all inputs.
- Apply rate limiting where appropriate.