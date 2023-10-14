package com.designpatterns.designpatterns.service;

import com.designpatterns.designpatterns.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    Iterable<User> buscarTodos();

    User buscarPorId(Long id);

    void inserir(User cliente);

    void atualizar(Long id, User cliente);

    void deletar(Long id);
}