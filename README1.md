# Spring MySQL demo

## REST APT
CRUD = Create, Read, Update, Delete

BASE_URL= http://localhost:8080/api

**Create:** POST: {BASE_URL}/{resourece}
**READ (one)** GET: {BASE_URL/{RESOURCE}/{ID}
**read (all):** GET: {BASE_URL/{resources}
**UPDATE** PUT: {BASE_URL/{resources}/{ID}
**DELETE:** DELETE: {BASE_URL/{resources}/{ID}

### Example: users

BASE_URL= http://localhost:8080/

**Create:** POST: http://localhost:8080/users
**READ (one)** GET: http://localhost:8080/users/5
**read (all):** GET: http://localhost:8080/users
**UPDATE** PUT: http://localhost:8080/users/5
**DELETE:** DELETE: http://localhost:8080/users/5

### Example: cars

BASE_URL= http://localhost:8080/

**Create:** POST: http://localhost:8080/cars
**READ (one)** GET: http://localhost:8080/cars/10
**read (all):** GET: http://localhost:8080/cars
**UPDATE** PUT: http://localhost:8080/cars/10
**DELETE:** DELETE: http://localhost:8080/cars/10
