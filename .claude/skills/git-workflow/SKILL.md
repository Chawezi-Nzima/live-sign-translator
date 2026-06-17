---
name: git-workflow
description: Git branching and source control standards.
---

# Purpose

Define source control practices for the project.

## Branch Strategy

```text
main
├── develop
├── feature/*
├── bugfix/*
├── release/*
└── hotfix/*
```

## Branch Rules

- Never commit directly to main.
- Create feature branches from develop.
- Merge using pull requests.
- Delete merged branches.

## Commit Convention

```text
feat: add camera preview screen

fix: resolve API timeout issue

docs: update deployment guide

test: add gesture recognition tests

refactor: simplify authentication service
```

## Pull Request Checklist

- Tests pass
- Documentation updated
- No merge conflicts
- Code reviewed

## Versioning

Use semantic versioning.

```text
MAJOR.MINOR.PATCH
```

Example:

```text
1.0.0
```