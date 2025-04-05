package SecuredApp.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Secured("ROLE_ADMIN")
    @PostMapping("/create")
    public String createUser() {
        return "Admin created a new user!";
    }

    @Secured("ROLE_ADMIN")
    @DeleteMapping("/delete")
    public String deleteUser() {
        return "Admin deleted a user!";
    }
}

