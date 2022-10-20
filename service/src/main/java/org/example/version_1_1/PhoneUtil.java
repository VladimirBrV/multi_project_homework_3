package org.example.version_1_1;

import lombok.experimental.UtilityClass;

@UtilityClass
public class PhoneUtil {
    public String getFullNumber(Phone phone) {
        return phone.getPerfix() + phone.getNumber();
    }

    public String getPhoneWithCode(Phone phone) {
        if (phone.getBonusCode() != null) {
            return phone.getPerfix() + phone.getNumber() + "#" + phone.getBonusCode();
        } else if (phone.getBonusCode() == null) {
            return phone.getPerfix() + phone.getNumber() + "";}
        return null;
    }
}

