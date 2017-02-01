package com.galvanize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chaturanu on 1/31/17.
 */
public class Business implements Addressable {

    private final String name;
    private ArrayList<Address> addresses;

    public Business(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public void addAddress(Address address) {

        if(address == null)
            return;

        if(addresses == null)
            addresses = new ArrayList<Address>();

        addresses.add(address);
    }
}
