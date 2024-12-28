package com.vanilla.service;

import com.vanilla.entity.Ammount;
import com.vanilla.repository.itf.AmmountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public void  createOrUpdateAmmount(Ammount ammount) {
        ammountRepository.save(ammount);
    }
    // Ammount 삭제
    @Transactional
    public void deleteAmmount(Ammount ammount) {
        ammountRepository.delete(ammount);
    }

    public List<Ammount> getAmmountsByMemberId(String memberId) {
        return ammountRepository.findByMemberId(memberId);
    }

}
