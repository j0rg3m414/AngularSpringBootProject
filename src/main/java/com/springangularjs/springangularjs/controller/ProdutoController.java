package com.springangularjs.springangularjs.controller;

import com.springangularjs.springangularjs.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private List<Produto> produtos = new ArrayList<Produto>();

    public ProdutoController() {
        produtos.add(new Produto(1L, "Notebook", 2500.00));
        produtos.add(new Produto(2L, "Smartphone", 1200.00));
        produtos.add(new Produto(3L, "Tablet", 800.00));
    }

    @GetMapping
    public List<Produto> listarTodos(){
        return produtos;
    }

    @PostMapping
    public Produto adicionar(@RequestBody Produto produto){
        produtos.add(produto);
        return produto;
    }

    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable Long id){
        return produtos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
