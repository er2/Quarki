package com.quarki;

import java.time.LocalDate;
import java.util.List;

public record Foo(String name,
                  List<Integer> nums,
                  LocalDate date) {
}
