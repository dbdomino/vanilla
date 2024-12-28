package com.vanilla.service;

import com.vanilla.entity.Ammount;
import com.vanilla.repository.itf.AmmountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AmmountService {
    private final AmmountRepository ammountRepository;

    public List<Ammount> getAllAmmounts() {
        return ammountRepository.findAll();
    }
    public Optional<Ammount> getAmmountById(Long id) {
        return ammountRepository.findById(id);
    }
    public Ammount createOrUpdateAmmount(Ammount ammount) {
        return ammountRepository.save(ammount);
    }

}
