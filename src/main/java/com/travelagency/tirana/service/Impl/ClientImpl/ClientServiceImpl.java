package com.travelagency.tirana.service.Impl.ClientImpl;

import com.travelagency.tirana.model.Client;
import com.travelagency.tirana.model.Destination;
import com.travelagency.tirana.repository.ClientRepository;
import com.travelagency.tirana.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {
    private ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }



    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> getById(long id) {
        return clientRepository.findById(id);
    }

    @Override
    public void delete(long clientId) {
        var dbClient = clientRepository.findById(clientId).orElseThrow(() -> new IllegalArgumentException("Invalid id"));
        clientRepository.delete(dbClient);
    }
}
