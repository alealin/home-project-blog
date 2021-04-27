package com.softserveinc.ita.home.blog.service;

import java.math.BigDecimal;
import com.softserveinc.ita.home.blog.model.Comment;
import com.softserveinc.ita.home.blog.model.Error;
import com.softserveinc.ita.home.blog.model.Post;
import com.softserveinc.ita.home.blog.model.Role;
import com.softserveinc.ita.home.blog.model.User;
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
public class UsersApiController implements UsersApi {

    private static final Logger log = LoggerFactory.getLogger(UsersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UsersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<User> createUser(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{\r\n  \"firstName\" : \"John\",\r\n  \"lastName\" : \"Smith\",\r\n  \"password\" : \"passworD321\",\r\n  \"role\" : \"\",\r\n  \"name\" : \"John78\",\r\n  \"id\" : 0.8008281904610115,\r\n  \"email\" : \"john.smith@example.com\"\r\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Comment> getCommentByCurrentUser(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Comment>(objectMapper.readValue("{\r\n  \"id\" : 0.8008281904610115,\r\n  \"text\" : \"text\",\r\n  \"updatedOn\" : \"2017-07-21T17:32:28Z\",\r\n  \"user\" : \"\",\r\n  \"createdOn\" : \"2017-07-21T17:32:28Z\"\r\n}", Comment.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Comment>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Comment>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Comment>> getCommentsByCurrentUser(@ApiParam(value = "") @Valid @RequestParam(value = "id", required = false) BigDecimal id
,@ApiParam(value = "In order to execute *asc*, you need to specify in the search *id* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id* ", allowableValues = "id, -id", defaultValue = "-id") @Valid @RequestParam(value = "sort", required = false, defaultValue="-id") String sort
,@ApiParam(value = "") @Valid @RequestParam(value = "page_num", required = false) Integer pageNum
,@ApiParam(value = "") @Valid @RequestParam(value = "page_size", required = false) Integer pageSize
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Comment>>(objectMapper.readValue("[ {\r\n  \"id\" : 0.8008281904610115,\r\n  \"text\" : \"text\",\r\n  \"updatedOn\" : \"2017-07-21T17:32:28Z\",\r\n  \"user\" : \"\",\r\n  \"createdOn\" : \"2017-07-21T17:32:28Z\"\r\n}, {\r\n  \"id\" : 0.8008281904610115,\r\n  \"text\" : \"text\",\r\n  \"updatedOn\" : \"2017-07-21T17:32:28Z\",\r\n  \"user\" : \"\",\r\n  \"createdOn\" : \"2017-07-21T17:32:28Z\"\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Comment>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Comment>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> getCurrentUser() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{\r\n  \"firstName\" : \"John\",\r\n  \"lastName\" : \"Smith\",\r\n  \"password\" : \"passworD321\",\r\n  \"role\" : \"\",\r\n  \"name\" : \"John78\",\r\n  \"id\" : 0.8008281904610115,\r\n  \"email\" : \"john.smith@example.com\"\r\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Post> getPostByCurrentUser(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Post>(objectMapper.readValue("{\r\n  \"previewAttachment\" : \"previewAttachment\",\r\n  \"id\" : 0.8008281904610115,\r\n  \"text\" : \"text\",\r\n  \"updatedOn\" : \"2017-07-21T17:32:28Z\",\r\n  \"title\" : \"title\",\r\n  \"createdOn\" : \"2017-07-21T17:32:28Z\",\r\n  \"user\" : \"\",\r\n  \"tags\" : [ {\r\n    \"name\" : \"Java8\",\r\n    \"id\" : 6.027456183070403\r\n  }, {\r\n    \"name\" : \"Java8\",\r\n    \"id\" : 6.027456183070403\r\n  } ]\r\n}", Post.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Post>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Post>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Post>> getPostsByCurrentUser(@ApiParam(value = "") @Valid @RequestParam(value = "id", required = false) BigDecimal id
,@ApiParam(value = "") @Valid @RequestParam(value = "tag_id", required = false) String tagId
,@ApiParam(value = "") @Valid @RequestParam(value = "tag_name", required = false) String tagName
,@ApiParam(value = "In order to execute *asc*, you need to specify in the search *id* or *title* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id* ", allowableValues = "id, -id, title, -title", defaultValue = "-id") @Valid @RequestParam(value = "sort", required = false, defaultValue="-id") String sort
,@ApiParam(value = "") @Valid @RequestParam(value = "page_num", required = false) Integer pageNum
,@ApiParam(value = "") @Valid @RequestParam(value = "page_size", required = false) Integer pageSize
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Post>>(objectMapper.readValue("[ {\r\n  \"previewAttachment\" : \"previewAttachment\",\r\n  \"id\" : 0.8008281904610115,\r\n  \"text\" : \"text\",\r\n  \"updatedOn\" : \"2017-07-21T17:32:28Z\",\r\n  \"title\" : \"title\",\r\n  \"createdOn\" : \"2017-07-21T17:32:28Z\",\r\n  \"user\" : \"\",\r\n  \"tags\" : [ {\r\n    \"name\" : \"Java8\",\r\n    \"id\" : 6.027456183070403\r\n  }, {\r\n    \"name\" : \"Java8\",\r\n    \"id\" : 6.027456183070403\r\n  } ]\r\n}, {\r\n  \"previewAttachment\" : \"previewAttachment\",\r\n  \"id\" : 0.8008281904610115,\r\n  \"text\" : \"text\",\r\n  \"updatedOn\" : \"2017-07-21T17:32:28Z\",\r\n  \"title\" : \"title\",\r\n  \"createdOn\" : \"2017-07-21T17:32:28Z\",\r\n  \"user\" : \"\",\r\n  \"tags\" : [ {\r\n    \"name\" : \"Java8\",\r\n    \"id\" : 6.027456183070403\r\n  }, {\r\n    \"name\" : \"Java8\",\r\n    \"id\" : 6.027456183070403\r\n  } ]\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Post>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Post>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> getUser(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{\r\n  \"firstName\" : \"John\",\r\n  \"lastName\" : \"Smith\",\r\n  \"password\" : \"passworD321\",\r\n  \"role\" : \"\",\r\n  \"name\" : \"John78\",\r\n  \"id\" : 0.8008281904610115,\r\n  \"email\" : \"john.smith@example.com\"\r\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getUserRole(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<User>> getUsers(@ApiParam(value = "") @Valid @RequestParam(value = "id", required = false) BigDecimal id
,@ApiParam(value = "") @Valid @RequestParam(value = "name", required = false) String name
,@ApiParam(value = "In order to execute *asc*, you need to specify in the search *id* or *name* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id* ", allowableValues = "id, -id, name, -name", defaultValue = "-id") @Valid @RequestParam(value = "sort", required = false, defaultValue="-id") String sort
,@ApiParam(value = "") @Valid @RequestParam(value = "page_num", required = false) Integer pageNum
,@ApiParam(value = "") @Valid @RequestParam(value = "page_size", required = false) Integer pageSize
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {\r\n  \"firstName\" : \"John\",\r\n  \"lastName\" : \"Smith\",\r\n  \"password\" : \"passworD321\",\r\n  \"role\" : \"\",\r\n  \"name\" : \"John78\",\r\n  \"id\" : 0.8008281904610115,\r\n  \"email\" : \"john.smith@example.com\"\r\n}, {\r\n  \"firstName\" : \"John\",\r\n  \"lastName\" : \"Smith\",\r\n  \"password\" : \"passworD321\",\r\n  \"role\" : \"\",\r\n  \"name\" : \"John78\",\r\n  \"id\" : 0.8008281904610115,\r\n  \"email\" : \"john.smith@example.com\"\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> removeCommentByCurrentUser(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> removePostByCurrentUser(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> removeUser(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Comment>> updateCommentByCurrentUser(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Comment body
,@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Comment>>(objectMapper.readValue("[ {\r\n  \"id\" : 0.8008281904610115,\r\n  \"text\" : \"text\",\r\n  \"updatedOn\" : \"2017-07-21T17:32:28Z\",\r\n  \"user\" : \"\",\r\n  \"createdOn\" : \"2017-07-21T17:32:28Z\"\r\n}, {\r\n  \"id\" : 0.8008281904610115,\r\n  \"text\" : \"text\",\r\n  \"updatedOn\" : \"2017-07-21T17:32:28Z\",\r\n  \"user\" : \"\",\r\n  \"createdOn\" : \"2017-07-21T17:32:28Z\"\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Comment>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Comment>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> updateCurrentUser(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{\r\n  \"firstName\" : \"John\",\r\n  \"lastName\" : \"Smith\",\r\n  \"password\" : \"passworD321\",\r\n  \"role\" : \"\",\r\n  \"name\" : \"John78\",\r\n  \"id\" : 0.8008281904610115,\r\n  \"email\" : \"john.smith@example.com\"\r\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Post> updatePostByCurrentUser(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Post body
,@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Post>(objectMapper.readValue("{\r\n  \"previewAttachment\" : \"previewAttachment\",\r\n  \"id\" : 0.8008281904610115,\r\n  \"text\" : \"text\",\r\n  \"updatedOn\" : \"2017-07-21T17:32:28Z\",\r\n  \"title\" : \"title\",\r\n  \"createdOn\" : \"2017-07-21T17:32:28Z\",\r\n  \"user\" : \"\",\r\n  \"tags\" : [ {\r\n    \"name\" : \"Java8\",\r\n    \"id\" : 6.027456183070403\r\n  }, {\r\n    \"name\" : \"Java8\",\r\n    \"id\" : 6.027456183070403\r\n  } ]\r\n}", Post.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Post>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Post>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> updateUser(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User body
,@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{\r\n  \"firstName\" : \"John\",\r\n  \"lastName\" : \"Smith\",\r\n  \"password\" : \"passworD321\",\r\n  \"role\" : \"\",\r\n  \"name\" : \"John78\",\r\n  \"id\" : 0.8008281904610115,\r\n  \"email\" : \"john.smith@example.com\"\r\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Role> updateUserRole(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Role body
,@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Role>(objectMapper.readValue("{\r\n  \"name\" : \"blogger\"\r\n}", Role.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Role>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Role>(HttpStatus.NOT_IMPLEMENTED);
    }

}
