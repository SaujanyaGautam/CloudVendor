package com.crudoper.service;

import com.crudoper.entity.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public CloudVendor deleteCloudVendor(Integer cloudVendorId);
    public CloudVendor getCloudVendor(Integer cloudVendorId);
    public List<CloudVendor>getAllCloudVendors();


}
