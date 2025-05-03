package resource.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import services.exceptions.ResourceNotFoundException;
import java.time.Instant;

public class ResourceExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, WebRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError();
        err.setTimestamp(Instant.now());
        err.setStatus(status.value());
        err.setError("Resource not found");
        err.setMessage(e.getMessage());
        err.setPath(request.getDescription(false));
        return ResponseEntity.status(status).body(err);
    }
}
