# Docker Backend Java Test

This is part of my Studies trying to learn more about Docker.

## Requirement

Your task is to add the necessary features to the current project's API blueprint structure to enable
it to manage **Docker** containers, also referred to as workers, as fallows:

🔄 Integrate the 🐳 Docker Java library (https://github.com/docker-java/docker-java/blob/main/docs/getting_started.md) to enable connect and manage 👷‍♀️ workers.

➕ Add the required fields and database migration for the 👷‍♂️ Worker entity to keep **all** the information associated on available at the container level (like 🔌 ports, 👨‍💼 name, 🟢 status, etc..)

🆕 Add required entities and tables to track the 👷‍♂️ Worker statistics.

🆙 Update the 👷‍♂️ WorkerController to add actions for:
* 📄 List workers (paginated)
* ▶️ Start and ⏹️ Stop worker
* 🔍 Get worker information
* 📊 Get worker statistics

## Run

Once you have established a connection to the database, you can test the application by using Swagger.

You can access Swagger by navigating to the following link: http://localhost:8080/swagger-ui/#/.
