package org.acme.dto.lombok;

import java.io.Serializable;

import lombok.Data;

@Data
public class BookDTOV2 implements Serializable{

    private String name; 
    private String type; 
    private int size; 
    private String value;


    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public String getType() {
    //     return type;
    // }
    // public void setType(String type) {
    //     this.type = type;
    // }
    // public int getSize() {
    //     return size;
    // }
    // public void setSize(int size) {
    //     this.size = size;
    // }
    // public String getValue() {
    //     return value;
    // }
    // public void setValue(String value) {
    //     this.value = value;
    // }

}
