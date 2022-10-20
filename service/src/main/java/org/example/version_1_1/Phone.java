package org.example.version_1_1;

import lombok.NonNull;
import lombok.Value;

@Value
public class Phone {
   @NonNull
    String perfix;
   @NonNull
   String number;
   String bonusCode;
}
