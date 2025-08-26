# GoPrudent

GoPrudent is a personal finance management application designed to help you track income, expenses, and savings effortlessly. It provides powerful visual insights through charts, budgeting tools, and notifications for overspending, enabling you to make prudent financial decisions.

## ✨ Features

* **Income & Expense Tracking:** Easily log and categorize all your financial transactions.
* **Visual Insights:** Understand your spending habits at a glance with interactive charts.
* **Budgeting Tools:** Create and manage budgets for different categories to stay on track.
* **Overspending Notifications:** Get real-time alerts when you're about to exceed your budget.
* **Savings Goals:** Set and monitor your progress toward specific savings targets.
* **Secure Data:** Your financial information is kept safe and secure.

---

## 💻 Local Setup

This project consists of a **Spring Boot backend** and an **Angular frontend**. To run the full application, you'll need to set up both parts.

### 📋 Prerequisites

Make sure you have the following installed on your system:

* **Java 17 or higher**
* **Maven**
* **Node.js & npm**
* **Git**
* **A database** (e.g., PostgreSQL, MySQL)

### 🚀 Backend Setup (Spring Boot)

1.  **Clone the repository:**
    Open your terminal and clone the Git repository.

    ```bash
    git clone [https://github.com/your-username/goprudent.git](https://github.com/your-username/goprudent.git)
    cd goprudent/backend
    ```

2.  **Create the `.env` file:**
    In the `backend` directory, create a new file named **`.env`** and add your database credentials.

    ```
    DB_USERNAME=your_username
    DB_PASSWORD=your_password
    DB_URL=your_db_url
    ```

    *The format for **DB_URL** depends on your specific database. For example, for MySQL, it might look like: `jdbc:mysql://localhost:3306/goprudent_db`.*

3.  **Build the project:**
    Use Maven to build the project. The `-DskipTests` flag will skip the test compilation and execution, making the build faster.

    ```bash
    mvn clean package -DskipTests
    ```

4.  **Run the application:**
    You can run the application directly from your IDE by running the `GoPrudentApplication.java` file or by using the Maven command below.

    ```bash
    mvn spring-boot:run
    ```

    The backend will start and typically run on `http://localhost:8080`.

---

### 🚀 Frontend Setup (Angular)

1.  **Navigate to the frontend directory:**
    From the root of the cloned repository, move into the `frontend` folder.

    ```bash
    cd ../frontend
    ```

2.  **Install dependencies:**
    Use npm to install all the required Angular packages.

    ```bash
    npm install
    ```

3.  **Run the Angular development server:**
    This command will compile the Angular application and launch it on a local server.

    ```bash
    ng serve
    ```

    The frontend will typically be accessible at `http://localhost:4200`. Once both the backend and frontend are running, you can access the full GoPrudent application in your browser.
