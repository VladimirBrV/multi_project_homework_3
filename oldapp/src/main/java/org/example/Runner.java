package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.version_1_0.Phone;
import org.example.version_1_0.PhoneUtil;
@Slf4j
public class Runner {
    public static void main(String[] args) {
        Phone phone = new Phone("+7", "912222331");
String getNumber = PhoneUtil.getFullNumber(phone);
        log.info(getNumber);
    }

}
