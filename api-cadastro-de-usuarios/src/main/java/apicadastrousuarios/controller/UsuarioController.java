package apicadastrousuarios.controller;

import apicadastrousuarios.model.Usuario;
import apicadastrousuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    public Usuario post(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }

    @PutMapping("/{id}")
    public Usuario put(@PathVariable Integer id, @RequestBody Usuario usuario) {
        usuario.setId(id); // Garante que o ID será atualizado corretamente
        return repository.save(usuario);
    }

    @GetMapping
    public List<Usuario> getUsuarios() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Usuario getOne(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}