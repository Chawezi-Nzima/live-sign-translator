---
name: mediapipe
description: MediaPipe standards for hand tracking and landmark extraction.
---

# Purpose

Provide guidelines for implementing hand tracking and landmark extraction.

## Technology Stack

- Python 3.12+
- OpenCV
- MediaPipe
- TensorFlow

## Pipeline

```text
Camera Input
→ Frame Processing
→ Hand Detection
→ Landmark Extraction
→ Feature Vector Creation
→ Gesture Classification
```

## MediaPipe Configuration

- Use MediaPipe Hands.
- Detect up to two hands.
- Use normalized landmarks.
- Track landmarks between frames.

## Landmark Data

Each hand contains:

- 21 landmarks
- X coordinate
- Y coordinate
- Z coordinate

## Performance Goals

- Real-time inference
- Stable frame rates
- Low CPU usage
- Low memory usage

## Best Practices

- Reuse MediaPipe instances.
- Avoid repeated model loading.
- Process frames asynchronously.
- Resize frames before inference.
- Filter noisy predictions.

## Constraints

- Optimize for CPU-first deployment.
- Support low-end hardware.
- Minimize inference latency.