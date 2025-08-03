package com.vanilla.repository.itf;

import com.vanilla.entity.Ammount;

import java.util.List;
import java.util.Optional;


//public interface AmmountRepository extends JpaRepository<Ammount, Integer> {
public interface AmmountRepository  {
    List<Ammount> findAll();
    Optional<Ammount> findById(Long id);
    void save(Ammount ammount);
    void delete(Ammount ammount);
    List<Ammount> findByMemberId(String memberId);
}