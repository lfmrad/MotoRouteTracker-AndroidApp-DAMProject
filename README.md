# Wheely: MotoRouteTracker-DAMFinalProject

Wheely is an Android app built for motorcyclists, providing tools to record, browse, and manage motorcycle routes. Developed as the final project in the **Técnico Superior en Desarrollo de Aplicaciones Multiplataforma (DAM)** program, Wheely focuses on accurately capturing and storing telemetry data, allowing users to create a detailed log of their riding experiences. The project was a collaborative effort with [Terciodecuplo](https://github.com/Terciodecuplo).

## Features

- **Real-time Route Tracking:** Capture routes with precise telemetry, including speed, duration, and GPS data.
- **Route History:** Review previously recorded routes with detailed statistics and visualizations.
- **Track Analysis:** Analyze routes with metrics like speed, time, distance, and elevation, fully localized for different languages.
- **User Profile Management:** Manage personal profiles, track history, and related data within the app.
- **Vehicle Management:** Add and manage vehicles linked to your routes, with options to edit and delete vehicle data.
- **User-Friendly Interface:** Intuitive UI with dynamic elements and responsive design.
- **Permissions Management:** Comprehensive handling of Android permissions for smooth operation across devices.

## Technologies Used

- **Programming Language:** Kotlin
- **IDE:** Android Studio
- **Architecture:** MVVM (Model-View-ViewModel)
- **Database:** Room
- **Mapping and Telemetry:** OSMDroid, OpenStreetMaps API

## My Contributions

I developed the entire map-related functionality of Wheely, from live route tracking to the UI for tracking and viewing routes. My key contributions include:

1. **Live Route Tracking and Data Management:**
   - **Tracking Pipeline:** Built the live tracking system from scratch, including the `TrackingService` for real-time GPS data logging.
   - **Custom Data Structures:** Designed custom data structures to manage and store telemetry data efficiently.
   - **Room Database Integration:** Implemented the logic to store tracked route data in a Room database, ensuring reliable data persistence.
   - **Data Flow Management:** Managed the entire data flow, from capturing live data to processing and exposing it through `TrackPointsRepository` and `TrackPointsViewModel` in the MVVM architecture.

2. **Track Analysis:**
   - Developed track analysis features that calculate and display metrics like speed, duration, distance, and elevation.

3. **User Interface Development:**
   - **UI Implementation:** Created the UIs for the **TrackViewer**, **TrackRecording**, and **Feed**, focusing on intuitive and seamless user interaction.
   - Integrated dynamic elements such as GPS signal indicators and live map previews to enhance the user experience.

4. **Resilience of Track Recording Screen:**
   - Developed robust logic to manage all UI states of the Track Recording screen, ensuring the activity could restore itself to the previous state regardless of user actions or phone events. This included handling various interruptions and maintaining consistency in the user experience.

5. **Mapping and Visualization:**
   - Integrated OSMDroid and OpenStreetMaps APIs for real-time route visualization and map interaction.
   - Refactored map operations into the `MapUtils` class for better code management.

6. **Bug Fixes and Optimization:**
   - Resolved mapping and tracking issues across different Android versions and optimized the code for better performance and maintainability.

These contributions were critical to the functionality and user experience of Wheely, particularly in handling live route tracking, data management, and map visualization.

## Collaborator Contributions

This project was developed in collaboration with [Terciodecuplo](https://github.com/Terciodecuplo), who contributed to key areas:

1. **User Interface Design:** Designed the navigation bar, toolbar, and user profile screens.
2. **Vehicle Management:** Implemented features for vehicle data management, including persistence, editing, and deletion, and integrated these with user profiles.
3. **Image and Media Handling:** Added support for profile pictures and media management related to routes and vehicles.
4. **Localization:** Handled localization, ensuring the app’s text and interface elements are adaptable to multiple languages.

## How to Run

1. **Clone the Repository:** Clone this repository to your local machine using `git clone`.
2. **Open in Android Studio:** Open the project in Android Studio.
3. **Build and Run:** Build the project and run it on an Android device or emulator.