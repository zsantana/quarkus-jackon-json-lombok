package org.acme.dto.record;

import java.io.Serializable;

public record BookDTO(String name, String type, int size, String value) implements Serializable {}
