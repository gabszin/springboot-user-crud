package services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;
import repositories.UserRepository;
import services.exceptions.ResourceNotFoundException;
import entities.user;
import java.util.Optional;


public interface userService {
	
	public static final UserRepository userRepository = null;

    public default List<user> findAll() {
        return userRepository.findAll();
    }

    public default user findById(Long id) {
        Optional<user> user = userRepository.findById(id);
        return user.orElseThrow();
    }

    public default User insert(User user) {
        return userRepository.save(user);
    }

    public default void delete(Long id) {
        try {
            userRepository.deleteById(id);
        } catch (Exception e) {
            throw new ResourceNotFoundException("User not found with id: " + id);
        }
    }

    public default user update(user id, User user) {
        try {
            entities.user entity = id;
            updateData(entity, user);
            return userRepository.save(entity);
        } catch (Exception e) {
            throw new ResourceNotFoundException("User not found with id: " + id);
        }
    }

    private void updateData(user entity, User user) {
        entity.setNome(user.getName());
        entity.setEmail(user.getEmail());
        entity.setTelefone(user.getTelefone());
        entity.setPassword(user.getPassword());
    }
}