---
name: database
description: Manage Supabase and PostgreSQL resources.
---

<!-- Tip: Use /create-skill in chat to generate content with agent assistance -->

Platform

Supabase

Core Tables

users
profiles
translations
gesture_datasets
audit_logs

Database Principles
Normalize data
Use foreign keys
Create indexes
Use Row Level Security
Security

Always:

Enable RLS
Use JWT authentication
Restrict access by user
Relationships

users
↓
translations

users
↓
profiles

gesture_datasets
↓
translations

SQL Standards
Meaningful table names
Explicit constraints
Proper indexes
Migration Rules
Version all schema changes
Document migrations
Avoid destructive changes