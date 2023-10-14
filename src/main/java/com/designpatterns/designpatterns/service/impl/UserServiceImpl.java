package com.designpatterns.designpatterns.service.impl;

import com.designpatterns.designpatterns.integration.ViaCepIntegration;
import com.designpatterns.designpatterns.model.Address;
import com.designpatterns.designpatterns.model.User;
import com.designpatterns.designpatterns.repository.AddressRepository;
import com.designpatterns.designpatterns.repository.UserRepository;
import com.designpatterns.designpatterns.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final AddressRepository addressRepository;

    private final ViaCepIntegration viaCepIntegration;

    @Override
    public Iterable<User> buscarTodos() {
        return userRepository.findAll();
    }

    @Override
    public User buscarPorId(Long id) {
        Optional<User> cliente = userRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(User cliente) {
        salvarUserComCep(cliente);
    }

    @Override
    public void atualizar(Long id, User user) {
        Optional<User> clienteBd = userRepository.findById(id);
        if (clienteBd.isPresent()) {
            salvarUserComCep(user);
        }
    }

    @Override
    public void deletar(Long id) {
        userRepository.deleteById(id);
    }

    private void salvarUserComCep(User user) {
        String cep = user.getAddress().getCep();

        Address endereco = addressRepository.findById(cep).orElseGet(() -> {
            Address novoAddress = viaCepIntegration.consultarCep(cep);
            addressRepository.save(novoAddress);
            return novoAddress;
        });

        user.setAddress(endereco);
        userRepository.save(user);
    }
}
