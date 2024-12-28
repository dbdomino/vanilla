package com.vanilla.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/** @date 2024-12-28
 * @package com.vanilla.repository
 * @filename AmmountRepositoryImpl
 * @author dbdomino
 *
 * @method
 *
 */
@Repository
public class AmmountRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Amount> findAll() {

    }
}
