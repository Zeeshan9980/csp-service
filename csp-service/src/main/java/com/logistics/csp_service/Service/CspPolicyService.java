package com.logistics.csp_service.Service;

import com.logistics.csp_service.entity.CspPolicy;
import com.logistics.csp_service.repository.CspPolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CspPolicyService {
    @Autowired
    private CspPolicyRepository repository;
    public CspPolicyService(CspPolicyRepository repository) {
        this.repository = repository;
    }

    public CspPolicy createOrUpdate(CspPolicy policy) {
        return repository.save(policy);
    }

    public Optional<CspPolicy> getByServiceName(String name) {
        return repository.findByServiceName(name);
    }

}
