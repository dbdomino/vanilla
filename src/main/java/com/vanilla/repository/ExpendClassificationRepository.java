package com.vanilla.repository;

import com.vanilla.domain.entity.ExpendClassification;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * C `save()`
 * R `findOne()`
 * R `findByName()`
 * U `update()`
 * D `delete()`
 */
@Repository
@Transactional
public class ExpendClassificationRepository {
    @PersistenceContext  // 엔티티 메니저(EntityManager) 주입
    private EntityManager em;

    // C
    public void save(ExpendClassification expendClassification) {
        em.persist(expendClassification);
    }

    // R
    public ExpendClassification findOne(Long id) {
        return em.find(ExpendClassification.class, id);
    }
    public List<ExpendClassification> findByName(String memberId) {
        // named 쿼리
        TypedQuery<ExpendClassification> query = em.createNamedQuery("ExpendClassification.findByUsername",ExpendClassification.class)
                .setParameter("memberId", memberId);
        List<ExpendClassification> expendClassifications = query.getResultList();
        // jpql 쿼리
//        TypedQuery<ExpendClassification> query2 = em.createQuery("select m from ExpendClassification m where m.memberId = :memberId",ExpendClassification.class)
//                .setParameter("memberId", memberId);
//        List<ExpendClassification> expendClassifications2 = query.getResultList(); // arrayList로 반환
        return expendClassifications;
    }

    // U
    public ExpendClassification updateExpendClassification(Long classificationId, String classificationName, Long limitCost, String sequence, String stat) {
        ExpendClassification expendClassification = findOne(classificationId);
        if (expendClassification == null) {
            throw new IllegalArgumentException("updateExpendClassification fail, Invalid classification ID: " + classificationId);
        }

        expendClassification.setClassificationName(classificationName);
        expendClassification.setLimitCost(limitCost);
        expendClassification.setSequence(sequence);
        expendClassification.setStat(stat);

        em.merge(expendClassification);

        return expendClassification;
    }

    // D
    public void delete(Long id) {
        ExpendClassification expendClassification = findOne(id);
        if (expendClassification == null) {
            throw new IllegalArgumentException("delete fail, Invalid classification ID: " + id);
        }
        em.remove(expendClassification);
    }
}
