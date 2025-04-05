RestAPIWithSpringBootQuickRef/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── SecuredApp/
│   │   │         ├── Application.java
│   │   │         ├── config/
│   │   │         │     └── SecurityConfig.java
│   │   │         └── controller/
│   │   │               └── UserController.java
│   │   │               └── AdminController.java
│   └── resources/
│        ├── application.properties
└── pom.xml

http://localhost:8080/api/user/welcome → No login needed

http://localhost:8080/api/user/profile → Login as user/password or admin/admin

http://localhost:8080/api/admin/create → Login as admin/admin

http://localhost:8080/api/admin/delete → Login as admin/admin


How did we secure REST APIs?	
Using Spring Security with method-level annotations like @Secured, @PreAuthorize

How did we manage different roles?	
Define roles in UserDetailsService and secure methods accordingly

How did we handle password encoding?
{noop} for testing; use bcrypt in production
