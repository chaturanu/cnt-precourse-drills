package com.galvanize;

import java.util.List;

/**
 * Created by chaturanu on 1/31/17.
 */
public interface Addressable {

    public List<Address> getAddresses();
    public void addAddress(Address address);
}
