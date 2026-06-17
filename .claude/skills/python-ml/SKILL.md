---
name: python-ml
description: Implement real-time sign language recognition.
---

<!-- Tip: Use /create-skill in chat to generate content with agent assistance -->

Preferred Stack
Python
OpenCV
MediaPipe
TensorFlow
Pipeline

Camera Input
→ Hand Detection
→ Landmark Extraction
→ Gesture Classification
→ Text Prediction
→ Speech Output

Project Structure

ml/

data/
models/
training/
inference/
utils/

Training Rules
Separate training from inference.
Save models using versioning.
Document datasets.
Performance Goals
Low latency
Real-time processing
High accuracy
Coding Standards
Modular functions
Type hints
Logging
Exception handling
Model Selection

Preferred order:

MediaPipe
TensorFlow
PyTorch (only if needed)
Inference Rules
Optimize for CPU first.
Minimize memory usage.
Reuse loaded models.