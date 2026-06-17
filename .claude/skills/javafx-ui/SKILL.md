---
name: javafx-ui
description: Build maintainable JavaFX desktop interfaces.
---

<!-- Tip: Use /create-skill in chat to generate content with agent assistance -->

Preferred Architecture

MVC Pattern

Structure

src/main/java

controllers/
services/
models/
utils/

src/main/resources

fxml/
css/
assets/

FXML Guidelines
Scene Builder compatible
Separate UI from logic
Reusable components
Controller Rules

Controllers should:

Handle UI events only
Delegate business logic to services
Avoid database access
Styling

Use CSS.

Example:

styles/
main.css
login.css
dashboard.css

Performance
Use background threads for long operations.
Never block JavaFX Application Thread.
Use Task and Service classes.
UI Standards
Responsive layouts
Consistent spacing
Accessibility support
Clear navigation
For This Project

Screens:

Login
Registration
Dashboard
Live Translation
History
Settings