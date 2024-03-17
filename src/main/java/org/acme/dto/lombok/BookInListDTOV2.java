package org.acme.dto.lombok;

import java.io.Serializable;

import lombok.Data;

@Data
public class BookInListDTOV2 implements Serializable{

    private String bookname;
    private BookRootBeanDTOV2 bookRootBean;

    // public String getBookname() {
    //     return bookname;
    // }
    // public void setBookname(String bookname) {
    //     this.bookname = bookname;
    // }
    // public BookRootBeanDTOV2 getBookRootBean() {
    //     return bookRootBean;
    // }
    // public void setBookRootBean(BookRootBeanDTOV2 bookRootBean) {
    //     this.bookRootBean = bookRootBean;
    // }

}
