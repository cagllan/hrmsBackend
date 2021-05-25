/*
 * package hrms.hrmsBackend.api.controllers;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import hrms.hrmsBackend.business.abstracts.UserService; import
 * hrms.hrmsBackend.core.utilites.results.DataResult; import
 * hrms.hrmsBackend.core.utilites.results.Result; import
 * hrms.hrmsBackend.entities.concretes.User;
 * 
 * @RestController
 * 
 * @RequestMapping("/api/users") public class UsersController {
 * 
 * private UserService userService;
 * 
 * @Autowired public UsersController(UserService userService) { super();
 * this.userService = userService; }
 * 
 * @PostMapping("/add") public Result add(@RequestBody User user) { return
 * this.userService.add(user); }
 * 
 * @GetMapping("/getall") public DataResult<List<User>> getAll() { return
 * this.userService.getAll(); } }
 */
