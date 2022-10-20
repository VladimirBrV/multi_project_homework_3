package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.version_1_1.Phone;
import org.example.version_1_1.PhoneUtil;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+7", "00000023", null);
        Phone phone2 =new Phone("+7", "00000023", "007");
       String getNumber1 = PhoneUtil.getFullNumber(phone1);
       String getNumber2= PhoneUtil.getPhoneWithCode(phone2);
log.info(getNumber1);
log.info(getNumber2);

    }
}
