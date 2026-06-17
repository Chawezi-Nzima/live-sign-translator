---
name: architecture
description: Provide architectural guidance for the Live Sign Language Translator system.
---

<!-- Tip: Use /create-skill in chat to generate content with agent assistance -->

Technology Stack
Java 21
JavaFX
Scene Builder
Python 3.12+
FastAPI
MediaPipe
TensorFlow
Supabase
PostgreSQL
Maven
Git
System Architecture

Desktop Client (JavaFX)
↓
FastAPI Backend
↓
ML Inference Service
↓
Supabase

Architectural Principles
Separation of Concerns
Single Responsibility Principle
Modular Design
Clean Architecture
API First Design
Project Modules
Frontend

Responsibilities:

Authentication UI
Camera Preview
Translation Display
Speech Controls
Settings
Backend API

Responsibilities:

Request Handling
Authentication
Translation Services
Database Access
ML Layer

Responsibilities:

Gesture Detection
Landmark Extraction
Gesture Classification
Model Inference
Database Layer

Responsibilities:

User Management
Translation History
Gesture Datasets
Folder Strategy

frontend/
backend/
ml/
database/
docs/

Rules
Keep modules independent.
Use APIs for communication.
Avoid direct database access from UI.
Design for future scalability.