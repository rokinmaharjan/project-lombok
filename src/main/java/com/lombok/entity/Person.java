package com.lombok.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
//@NoArgsConstructor
public class Person {
	private String name;
	private int age;
	private String address;
}
