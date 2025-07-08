package com.logistics.csp_service.controller;

import com.logistics.csp_service.Service.CspPolicyService;
import com.logistics.csp_service.entity.CspPolicy;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/csp")
public class CspPolicyController {
    @Autowired
    private CspPolicyService service;
    @PostMapping
    public ResponseEntity<CspPolicy> create(@Valid @RequestBody CspPolicy policy) {
        return ResponseEntity.ok(service.createOrUpdate(policy));
    }

    @GetMapping("/{serviceName}")
    public ResponseEntity<String> get(@PathVariable String serviceName) {
        Optional<CspPolicy> policy = service.getByServiceName(serviceName);
        return policy.map(p -> ResponseEntity.ok(p.getDirectives()))
                .orElse(ResponseEntity.notFound().build());
    }
}
