package org.acme.controller;

import java.util.stream.Collectors;

import org.acme.dto.lombok.BookInListDTOV2;
import org.acme.dto.lombok.RetornoDTOV2;
import org.acme.dto.record.BookInListDTO;
import org.acme.dto.record.RetornoDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/api/book")
public class GreetingResource {

    private static Logger log = LoggerFactory.getLogger(GreetingResource.class);


    @POST
    @Path("/v1")
    public RetornoDTO processar( BookInListDTO bookInListDTO) {

        // log.info("Bookname: {}" , bookInListDTO.bookname());
        // log.info("Book items:");

        String resultado = bookInListDTO
                                .bookRootBean()
                                .bookItems()
                                .stream()
                                .map(book -> book.name() + book.type() + book.size() + book.value())
                                .collect(Collectors.joining());

        return new RetornoDTO(resultado);
        
    }

    @POST
    @Path("/v2")
    public RetornoDTOV2 processar( BookInListDTOV2 bookInListDTO) {

        StringBuffer sb = new StringBuffer();

        bookInListDTO.getBookRootBean().getBookItems().forEach(book -> {

            // log.info("  Name: " + book.name());
            // log.info("  Type: " + book.type());
            // log.info("  Size: " + book.size());
            // log.info("  Value: " + book.value());

            sb.append(book.getName() + book.getType() + book.getSize() + book.getValue());
        });

        return new RetornoDTOV2(sb.toString());

    }

    @POST
    @Path("/v3")
    public String processar( String jsonString) {

        try {
            // Converter a string JSON para objeto Java
            ObjectMapper mapper = new ObjectMapper();
            BookInListDTOV2 bookInListDTO = mapper.readValue(jsonString, BookInListDTOV2.class);
            
            // Log dos dados recebidos
            // log.info("Bookname: {}", bookInListDTO.getBookname());
            // log.info("Book items:");
            StringBuilder sb = new StringBuilder();
            bookInListDTO.getBookRootBean().getBookItems().forEach(book -> {

                // log.info("  Name: {}", book.getName());
                // log.info("  Type: {}", book.getType());
                // log.info("  Size: {}", book.getSize());
                // log.info("  Value: {}", book.getValue());
                sb.append(book.getName()).append(book.getType()).append(book.getSize()).append(book.getValue());
            });

            return sb.toString();

        } catch (Exception e) {
            log.error("Erro ao processar o JSON", e);
            return "Erro ao processar o JSON";
        }

    }
}
