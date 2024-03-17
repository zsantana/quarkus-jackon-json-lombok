package org.acme.dto.lombok;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RetornoDTOV2 implements Serializable {
    private String name;
}
