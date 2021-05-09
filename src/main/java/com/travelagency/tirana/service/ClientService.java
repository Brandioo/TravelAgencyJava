package com.travelagency.tirana.service;

import com.travelagency.tirana.model.Client;


import java.util.List;
import java.util.Optional;

public interface ClientService {
    List<Client> getAll();
    Optional<Client> getById(long id);
    void delete(long clientId);
}
