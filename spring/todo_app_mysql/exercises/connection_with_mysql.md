Connection with MySQL

Create a new Spring project with Gradle.
Add dependencies: JPA, MySQL, Web, Thymeleaf, Lombok, DevTools.
Copy previously created classes and template.
Connect to database.
Create new database in MySQL.

Configuration

Configure application.properties file in the needed structure:

spring.datasource.url=jdbc:mysql://localhost/todo?serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=12345
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
spring.logging.level.org.hibernate.SQL=debug
spring.jpa.show-sql=true

Specify property hibernate.ddl-auto (possible options: create, create-drop, update):
with create-drop at first,
and after first recompiling, with update, so the database schema will be
automatically updated accordingly to java entities found in the project.
Run the program.
If you did well, then a new and empty "todo" table should appear
with 4 columns(id, title, isUrgent, isDone) in MySQL.
