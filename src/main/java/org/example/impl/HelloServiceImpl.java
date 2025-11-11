package org.example.impl;

import jakarta.jws.WebService;
import org.example.api.HelloService;
import org.example.model.Person;

@WebService(
        serviceName = "HelloService",
        portName = "HelloServicePort",
        endpointInterface = "org.example.api.HelloService",
        targetNamespace = "http://org.example.acme.com/"
)
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Bonjour, " + (name == null ? "inconnu" : name);
    }

    @Override
    public Person findPersonById(String id) {
        return new Person(id, "Ada Lovelace", 36); // maquette
    }
}
