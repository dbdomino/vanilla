package com.vanilla.controller;

import com.vanilla.entity.Ammount;
import com.vanilla.service.AmmountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ammounts")
public class AmmountController {
    private final AmmountService ammountService;
    private final RestClient restClient = RestClient.builder().build();

    @GetMapping
    public List<Ammount> getAllAmmounts() {
        return ammountService.getAllAmmounts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ammount> getAmmountById(@PathVariable Long id) {
        return ammountService.getAmmountById(id)
                .map(ResponseEntity::ok) // Optional이 비어 있지 않다면 200 OK와 함께 데이터 반환
                .orElseGet(() -> ResponseEntity.notFound().build());  // Optional이 비어 있다면 404 Not Found 반환
    }

    @GetMapping("/member/{memberId}")
    public ResponseEntity<List<Ammount>> getAmmountByMemberId(@PathVariable String memberId) {
        List<Ammount> ammountList = ammountService.getAmmountsByMemberId(memberId);
        return Optional.of(ammountService.getAmmountsByMemberId(memberId))
                .filter(list -> !list.isEmpty())
                .map(ResponseEntity::ok)
                .orElseGet( () -> ResponseEntity.notFound().build());
//        return ammountList.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(ammountList);
//        if (ammountList.isEmpty()) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(ammountList);
    }
}
