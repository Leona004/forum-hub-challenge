package controller;

public class TopicoController package com.alura.forumhub.controller;

import com.alura.forumhub.model.Topico;
import com.alura.forumhub.service.TopicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    private final TopicoService topicoService;

    public TopicoController(TopicoService topicoService) {
        this.topicoService = topicoService;
    }

    @GetMapping
    public List<Topico> listar() {
        return topicoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topico> buscar(@PathVariable Long id) {
        return topicoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Topico criar(@RequestBody Topico topico) {
        return topicoService.salvar(topico);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Topico> atualizar(@PathVariable Long id, @RequestBody Topico topico) {
        return topicoService.buscarPorId(id)
                .map(t -> {
                    t.setTitulo(topico.getTitulo());
                    t.setMensagem(topico.getMensagem());
                    t.setCurso(topico.getCurso());
                    return ResponseEntity.ok(topicoService.salvar(t));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return topicoService.buscarPorId(id)
                .map(t -> {
                    topicoService.deletar(id);
                    return ResponseEntity.ok().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
{
}
