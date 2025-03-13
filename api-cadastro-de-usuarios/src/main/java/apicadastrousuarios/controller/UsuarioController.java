package apicadastrousuarios.controller;

import apicadastrousuarios.model.Usuario;
import apicadastrousuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @PostMapping
    public Usuario criarUsuarios(@RequestBody Usuario usuario) {
        return service.criarUsuario(usuario);
    }

    @PutMapping("/{id}")
    public Usuario atualizarUsuario(@PathVariable Integer id, @RequestBody Usuario usuario) {
        usuario.setId(id); // Garante que o ID será atualizado corretamente
        return service.atualizarUsuario(usuario);
    }

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return service.listarUsuarios();
    }

    @GetMapping("/{id}")
    public Usuario buscarUsuario(@PathVariable Integer id) {
        return service.buscarUsuario(id);
    }

    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Integer id) {
        service.deletarUsuario(id);
    }
}