/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.softserveinc.ita.home.blog.service;

import java.math.BigDecimal;
import com.softserveinc.ita.home.blog.model.Error;
import com.softserveinc.ita.home.blog.model.Tag;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-04-27T00:59:28.741629100+03:00[Europe/Helsinki]")
@Api(value = "tags", description = "the tags API")
public interface TagsApi {

    @ApiOperation(value = "Get Tag by ID", nickname = "getTag", notes = "Retrieves an existing Tag associated with the specified ID.", response = Tag.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "Tags", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Tag.class),
        @ApiResponse(code = 400, message = "The payload contains an error.", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found.", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @RequestMapping(value = "/tags/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Tag> getTag(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id
);


    @ApiOperation(value = "Get tags", nickname = "getTags", notes = "Uses query keys to retrieve a subset of existing tags.", response = Tag.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "Tags", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Tag.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @RequestMapping(value = "/tags",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Tag>> getTags(@ApiParam(value = "") @Valid @RequestParam(value = "id", required = false) BigDecimal id
,@ApiParam(value = "") @Valid @RequestParam(value = "name", required = false) String name
,@ApiParam(value = "In order to execute *asc*, you need to specify in the search *id* or *name* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id* ", allowableValues = "id, -id, name, -name", defaultValue = "name") @Valid @RequestParam(value = "sort", required = false, defaultValue="name") String sort
,@ApiParam(value = "") @Valid @RequestParam(value = "page_num", required = false) Integer pageNum
,@ApiParam(value = "") @Valid @RequestParam(value = "page_size", required = false) Integer pageSize
);


    @ApiOperation(value = "Remove Tag", nickname = "removeTag", notes = "Deletes a Tag associated with a specified ID.", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "Tags", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The request was succesfully processed."),
        @ApiResponse(code = 400, message = "The payload contains an error.", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized.", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden.", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found.", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @RequestMapping(value = "/tags/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> removeTag(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id
);

}
