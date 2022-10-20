package org.example.version_1_0;

import lombok.NonNull;
import lombok.Value;

@Value
public class Phone {
    @NonNull
    String perfix;
    @NonNull
    String number;
}
