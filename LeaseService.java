package com.trimble.Trimble.Cars;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LeaseService {
	 @Autowired
	    private LeaseRepository leaseRepository;

	    public List<Lease> getLeasesByCustomerId(Long customerId) {
	        return leaseRepository.findByCustomerId(customerId);
	    }

	    public Lease createLease(Lease lease) {
	        return leaseRepository.save(lease);
	    }

}
