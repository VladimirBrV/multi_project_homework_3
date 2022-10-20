package org.example.version_1_0;

import lombok.experimental.UtilityClass;

@UtilityClass
public class PhoneUtil {
    public String getFullNumber (Phone phone) {
        return phone.getPerfix()+phone.getNumber();
    }

}
