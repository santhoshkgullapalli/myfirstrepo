package com.ngc.salesforceplaywright.playwrightngc.builders;
import com.ngc.salesforceplaywright.playwrightngc.models.AddressDTO;
import com.ngc.salesforceplaywright.playwrightngc.utils.RandomGen;

import lombok.experimental.UtilityClass;

@UtilityClass
public class AddressBuilder {
    public static AddressDTO buildAddress() {
        return AddressDTO.builder()
                .street(RandomGen.getRandomStreetAddress())
                .city(RandomGen.getRandomCity())
                .country("US")
                .county("Hamilton")
                .state("IN")
                .zip(RandomGen.getRandomZipCode())
                .build();
    }
}
