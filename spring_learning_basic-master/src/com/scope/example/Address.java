package com.scope.example;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Scope(value = "prototype", proxyMode = ScopedProxyMode.INTERFACES)
public class Address {
	
	String name;
}
