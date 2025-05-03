package entities;
import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "tb_user")
public class user implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String password;
    
    public user() {}
    public user(Long id, String nome, String email, String telefone, String password) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
    this.password = password;
    }
    
    public int hashCode() {
        return Objects.hash(id);
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        user other = (user) obj;
        return Objects.equals(id, other.id);
    }
	public void setNome(String name) {
		// TODO Auto-generated method stub
		
	}
	public void setPassword(String password2) {
		// TODO Auto-generated method stub
		
	}
}

