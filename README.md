![Home](https://github.com/user-attachments/assets/91ddba49-ef99-40a7-85bb-8f35a7df3270)
![Details](https://github.com/user-attachments/assets/03c84235-9618-42c7-b407-e4cefc747090)
![Edit](https://github.com/user-attachments/assets/e98a083a-eebd-42d5-aa93-4e1ec9252466)

This project is a basic full-stack application featuring a responsive user interface (UI) with the following functionalities:

- **Home Page:** Displays the main landing page of the application.
- **Add User Page:** Allows users to input and add a new user.
- **View Specific User Page:** Shows details of a selected user, allowing for viewing and updating.

### Technologies Used:

- **Backend (Spring Boot):**
  - Spring Boot is employed as the backend framework.
  - It provides RESTful APIs to handle CRUD (Create, Read, Update, Delete) operations for user data.
  - Manages the interaction between the frontend and the MySQL database.

- **Frontend (React):**
  - React is utilized to build the frontend user interface.
  - The UI is designed to be responsive, ensuring a seamless user experience across different devices.
  - Allows users to interact with the backend APIs for adding, viewing, updating, and deleting user data.

- **Database (MySQL):**
  - MySQL serves as the backend database for storing user information.
  - Stores user details such as name, address, etc.

### Functionality Overview:

1. **Add User:**
   - Users can input new user details (name, address) via the UI.
   - This data is sent to the backend (Spring Boot) via API calls and stored in the MySQL database.

2. **Delete User:**
   - Allows deletion of a specific user from the database.
   - Triggered via API calls from the frontend.

3. **View Specific User:**
   - Retrieves and displays detailed information about a specific user.
   - Users can view and update user details as required.

4. **Update User Details:**
   - Enables users to modify existing user information.
   - The updated data is sent to the backend, which updates the corresponding record in MySQL.

### Integration Flow:

- **Frontend-Backend Communication:**
  - React frontend communicates with the Spring Boot backend through HTTP requests.
  - Data exchange typically involves JSON format for ease of processing and compatibility.
  - Ensures efficient handling of user interactions and data management tasks.

This setup provides a comprehensive full-stack application where frontend and backend components work together seamlessly to manage user data and deliver a responsive user experience.
