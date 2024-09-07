package com.porto.estudosspringjpa.controller;

import com.porto.estudosspringjpa.model.Produto;
import com.porto.estudosspringjpa.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> getAllProducts() {
        return this.produtoRepository.findAll();
    }

    @PostMapping
    public Produto criar(@RequestBody Produto produto) {
        return this.produtoRepository.save(produto);
    }
}
