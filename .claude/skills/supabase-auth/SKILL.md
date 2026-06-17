---
name: supabase-auth
description: Authentication and authorization standards using Supabase.
---

# Purpose

Define authentication workflows and security requirements.

## Technology Stack

- Supabase Auth
- PostgreSQL
- JWT

## Authentication Methods

- Email and password
- Session tokens

## Architecture

```text
JavaFX Client
        ↓
FastAPI Backend
        ↓
Supabase Auth
```

## User Flows

- Registration
- Login
- Logout
- Password reset
- Session refresh

## Rules

- Never store passwords locally.
- Store tokens securely.
- Validate tokens on every request.
- Refresh expired sessions automatically.

## Authorization

- Use Row Level Security.
- Restrict access to user-owned data.
- Apply least privilege principles.

## Security Requirements

- HTTPS only
- Token expiration
- Secure secret management
- Audit authentication events