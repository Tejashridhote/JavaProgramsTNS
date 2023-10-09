package com.tns.daysix.association.hasa;

public class Executor {

	public static void main(String[] args) {

        Address address = new Address("laxmi enclave","erode","tn","500067");
        Person person = new Person("arun ",address);
        person.displyInmfo();
        System.out.println(address);
        System.out.println(person);

	}

}
