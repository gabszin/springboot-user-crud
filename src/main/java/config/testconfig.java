package config;
import entities.user;
import repositories.UserRepository;

public class testconfig {
	@Autowired
	private UserRepository userRepository;
	
	public void run(String... args) throws Exception{
	user u1 = new user(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
	user u2 = new user(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
	}
}
