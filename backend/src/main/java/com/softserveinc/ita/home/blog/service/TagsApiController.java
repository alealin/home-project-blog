package com.softserveinc.ita.home.blog.service;

import java.math.BigDecimal;
import com.softserveinc.ita.home.blog.model.Error;
import com.softserveinc.ita.home.blog.model.Tag;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-04-27T00:59:28.741629100+03:00[Europe/Helsinki]")
@Controller
public class TagsApiController implements TagsApi {

    private static final Logger log = LoggerFactory.getLogger(TagsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TagsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Tag> getTag(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Tag>(objectMapper.readValue("{\r\n  \"name\" : \"Java8\",\r\n  \"id\" : 6.027456183070403\r\n}", Tag.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Tag>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Tag>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Tag>> getTags(@ApiParam(value = "") @Valid @RequestParam(value = "id", required = false) BigDecimal id
,@ApiParam(value = "") @Valid @RequestParam(value = "name", required = false) String name
,@ApiParam(value = "In order to execute *asc*, you need to specify in the search *id* or *name* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id* ", allowableValues = "id, -id, name, -name", defaultValue = "name") @Valid @RequestParam(value = "sort", required = false, defaultValue="name") String sort
,@ApiParam(value = "") @Valid @RequestParam(value = "page_num", required = false) Integer pageNum
,@ApiParam(value = "") @Valid @RequestParam(value = "page_size", required = false) Integer pageSize
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Tag>>(objectMapper.readValue("[ {\r\n  \"name\" : \"Java8\",\r\n  \"id\" : 6.027456183070403\r\n}, {\r\n  \"name\" : \"Java8\",\r\n  \"id\" : 6.027456183070403\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Tag>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Tag>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> removeTag(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
