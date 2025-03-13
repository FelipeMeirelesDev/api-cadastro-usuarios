package apicadastrousuarios.service;

import apicadastrousuarios.model.Usuario;
import apicadastrousuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario atualizarUsuario(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return repository.findAll();
    }

    public Usuario buscarUsuario(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public void deletarUsuario(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
