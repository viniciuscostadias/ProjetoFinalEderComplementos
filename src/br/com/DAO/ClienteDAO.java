package br.com.DAO;

import br.com.DTO.ClienteDTO;
import br.com.VIEW.TelaClientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ClienteDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void limpar() {
        TelaClientes.txtEmail.setText(null);
        TelaClientes.txtEndereco.setText(null);
        TelaClientes.txtId.setText(null);
        TelaClientes.txtNome.setText(null);
        TelaClientes.txtTelefone.setText(null);
        TelaClientes.txtCpf_Cnpj.setText(null);

    }

    public void criar(ClienteDTO dto) {
        String sql = "insert into tb_clientes (id, nome, endereco, telefone, email, cpf_cnpj)  value(?,?,?,?, ?, ?) ";
        conexao = ConexaoDAO.connector();

        try {
            pst = conexao.prepareStatement(sql);

            pst.setInt(1, dto.getId());
            pst.setString(2, dto.getNome());
            pst.setString(3, dto.getEndereco());
            pst.setString(4, dto.getTelefone());
            pst.setString(5, dto.getEmail());
            pst.setString(6, dto.getCpf_cnpj());

            int go = pst.executeUpdate();

            if (go > 0) {
                limpar();
                TelaClientes.txtId.setText(null);
                JOptionPane.showMessageDialog(null, "adicionado com sucesso");
            }

        } catch (Exception e) {

            if (e.getMessage().contains("tb_clientes.PRIMARY")) {
                JOptionPane.showMessageDialog(null, "id ja em uso");
            } else {

                JOptionPane.showMessageDialog(null, e.getMessage());

            }
        }

    }

    public void pesquisar(ClienteDTO dto){
        String sql = "select * from tb_clientes where id = ?";
        conexao = ConexaoDAO.connector();
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, dto.getId());
            rs = pst.executeQuery();
            
            if(rs.next()){
                TelaClientes.txtNome.setText(rs.getString(2));
                TelaClientes.txtEndereco.setText(rs.getString(3));
                TelaClientes.txtTelefone.setText(rs.getString(4));
                TelaClientes.txtEmail.setText(rs.getString(5));
                TelaClientes.txtCpf_Cnpj.setText(rs.getString(6));
            } else {
                limpar();
                JOptionPane.showMessageDialog(null, "Usuario não cadastrado.");

            }


            }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void deletar(ClienteDTO dto){
        int res = JOptionPane.showConfirmDialog(null, "Tem certeza que quer deletar o cliente de ID " + TelaClientes.txtId.getText() + "?",
                null, JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            String sql = "delete from tb_clientes where id = ? ";
            conexao = ConexaoDAO.connector();
            try {
                pst = conexao.prepareStatement(sql);
                pst.setInt(1, dto.getId());
                int result = pst.executeUpdate();
                if (result > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso");
                    limpar();
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "metodo deletar:" + e.getMessage());
            }
        }

    }
    
   public void atualizar(ClienteDTO dto) {
        int res = JOptionPane.showConfirmDialog(null, "Quer mesmo alterar o cliente de ID " + TelaClientes.txtId.getText() + "?",
                null, JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            String sql = "update tb_clientes set nome = ?, endereco= ?, telefone= ?, email= ?, cpf_cnpj= ? where id= ?";
            conexao = ConexaoDAO.connector();

            try {
                pst = conexao.prepareStatement(sql);

                pst.setString(1, dto.getNome());
                pst.setString(2, dto.getEndereco());
                pst.setString(3, dto.getTelefone());
                pst.setString(4, dto.getEmail());
                pst.setString(5, dto.getCpf_cnpj());
                pst.setInt(6, dto.getId());

                int result = pst.executeUpdate();

                if (result > 0) {
                    JOptionPane.showMessageDialog(null, "Alterado com sucesso");
                    limpar();
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
    
}
