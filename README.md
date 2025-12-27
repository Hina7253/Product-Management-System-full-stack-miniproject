# Full Stack Product Management 
A simple **Full Stack CRUD Application** built using **React.js (Frontend)** and **Spring Boot + Maven (Backend)**.  
Users can add, update, delete, and view products.

---

### 🚀 Tech Stack

## **Frontend (React):**
- React.js  
- Axios  
- Bootstrap  
- React Router DOM  



---


---

## 🔧 Backend Setup (Spring Boot - Maven)
1. Import the project in **Eclipse / IntelliJ**  
2. Install dependencies:
3. Configure your database in  
`src/main/resources/application.properties`
4. Run the backend


---

## ✔ Backend APIs

| Method | Endpoint               | Description           |
|--------|-------------------------|-----------------------|
| POST   | /saveProduct           | Add new product       |
| GET    | /products              | Get all products      |
| GET    | /product/{id}          | Get product by ID     |
| PUT    | /editProduct/{id}      | Update product        |
| DELETE | /delete/{id}           | Delete product        |

---

## 🎨 Frontend Setup (React)

1. Go to the frontend folder:
2. Install dependencies:
3. Start the React app:

React runs on:http://localhost:3001/


---

## 🔄 Connecting Frontend & Backend

Enable CORS in backend:

```java
@CrossOrigin(origins = "http://localhost:3001")




