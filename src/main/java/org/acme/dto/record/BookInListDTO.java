package org.acme.dto.record;

import java.io.Serializable;

public record BookInListDTO(String bookname, BookRootBeanDTO bookRootBean) implements Serializable {}
