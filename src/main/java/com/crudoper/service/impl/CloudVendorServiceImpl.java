package com.crudoper.service.impl;

import com.crudoper.entity.CloudVendor;
import com.crudoper.exception.CloudVendorNotFoundException;
import com.crudoper.repository.CloudVendorRepository;
import com.crudoper.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }


    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public CloudVendor deleteCloudVendor(Integer cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return null;
    }

    @Override
    public CloudVendor getCloudVendor(Integer cloudVendorId) {
        if (cloudVendorRepository.findById(cloudVendorId).isEmpty())
            throw new CloudVendorNotFoundException("Requested Cloud Vendor Doesnot Exist");
        return  cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
