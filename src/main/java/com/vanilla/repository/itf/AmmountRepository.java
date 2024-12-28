package com.vanilla.repository.itf;

import com.vanilla.entity.Ammount;

import java.util.List;


//public interface AmmountRepository extends JpaRepository<Ammount, Integer> {
public interface AmmountRepository  {
    List<Ammount> findAll();
    Ammount findById(Long id);
    void save(Ammount ammount);
    void delete(Ammount ammount);
}