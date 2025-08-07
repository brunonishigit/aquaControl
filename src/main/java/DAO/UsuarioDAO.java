package DAO;

import conexaoBD.ConnectFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    
    private Connection conn; 
    
    public UsuarioDAO() {
        this.conn = new ConnectFactory().obtemConexao();
    }
    
    public void cadastrarUsuario(Usuario a) {
        
        String sql = "Insert into usuario(nome, senha)" + "values(?,?)";
        
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, a.getNome());
            ps.setString(2, a.getSenha());
            
            ps.execute();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado com Sucesso!");
                
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Usuário não conseguiu Cadastrar!");
        }
    }
    
    
    public Usuario autenticar(Usuario a) {
        
        String sql = "SELECT id, nome, senha, tipo FROM usuario WHERE nome = ? AND senha = ?";

        try (Connection conn = ConnectFactory.obtemConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getSenha());

            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setTipo(rs.getString("tipo")); // <- importante para diferenciar admin/usuário
                return usuario; 
            }else{
                return null; //usuário não encontrado
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
