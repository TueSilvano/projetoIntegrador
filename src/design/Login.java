package design;

/**
 * Definição da classe Login
 * @author emanu_qlf
 */
public class Login {
    private String usuario;
    private String senha;

    /**
     * Construtor da classe login
     * @param usuario
     * @param senha 
     */
    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }
    public String getUsuario() {
        return usuario;
    }
}