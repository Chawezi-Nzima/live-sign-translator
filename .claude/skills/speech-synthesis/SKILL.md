---
name: speech-synthesis
description: Guidelines for converting translated text into speech.
---

# Purpose

Convert recognized gestures into natural speech output.

## Architecture

```text
Gesture
→ Text Translation
→ Text-to-Speech Engine
→ Audio Output
```

## Technology Options

### Java Frontend

- FreeTTS
- MaryTTS

### Python Backend

- pyttsx3

## Rules

- Generate speech asynchronously.
- Prevent duplicate playback.
- Allow speech interruption.
- Support multiple languages in future versions.

## User Controls

- Enable or disable speech
- Select voice
- Adjust speech rate
- Adjust volume

## Performance Goals

- Minimal speech delay
- Clear pronunciation
- Low resource consumption

## Accessibility Guidelines

- Provide visual feedback when speaking.
- Allow text-only operation.
- Ensure speech controls are accessible.