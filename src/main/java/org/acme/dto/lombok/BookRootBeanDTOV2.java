package org.acme.dto.lombok;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class BookRootBeanDTOV2 implements Serializable{

    private List<BookDTOV2> bookItems;

    // public List<BookDTOV2> getBookItems() {
    //     return bookItems;
    // }

    // public void setBookItems(List<BookDTOV2> bookItems) {
    //     this.bookItems = bookItems;
    // }

}