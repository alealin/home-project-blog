package com.softserveinc.ita.home.blog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.softserveinc.ita.home.blog.model.Tag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A representation of Post entity.
 */
@ApiModel(description = "A representation of Post entity.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-04-27T00:59:28.741629100+03:00[Europe/Helsinki]")
public class Post   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("tags")
  @Valid
  private List<Tag> tags = null;

  @JsonProperty("createdOn")
  private OffsetDateTime createdOn = null;

  @JsonProperty("user")
  private Object user = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("previewAttachment")
  private String previewAttachment = null;

  @JsonProperty("updatedOn")
  private OffsetDateTime updatedOn = null;

  public Post id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the Post.
   * @return id
  **/
  @ApiModelProperty(readOnly = true, value = "The ID of the Post.")
  
    @Valid
    public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public Post tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public Post addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * The subset of assosiated tags to the Post.
   * @return tags
  **/
  @ApiModelProperty(value = "The subset of assosiated tags to the Post.")
      @Valid
    public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public Post createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The Post creation date.
   * @return createdOn
  **/
  @ApiModelProperty(example = "2017-07-21T17:32:28Z", readOnly = true, value = "The Post creation date.")
  
    @Valid
    public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public Post user(Object user) {
    this.user = user;
    return this;
  }

  /**
   * The creator of the Post.
   * @return user
  **/
  @ApiModelProperty(readOnly = true, value = "The creator of the Post.")
  
    public Object getUser() {
    return user;
  }

  public void setUser(Object user) {
    this.user = user;
  }

  public Post text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The content of the Post.
   * @return text
  **/
  @ApiModelProperty(value = "The content of the Post.")
  
    public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Post title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The summary of the Post.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "The summary of the Post.")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Post previewAttachment(String previewAttachment) {
    this.previewAttachment = previewAttachment;
    return this;
  }

  /**
   * URL of the resource that will be used as an preview of the Post.
   * @return previewAttachment
  **/
  @ApiModelProperty(required = true, value = "URL of the resource that will be used as an preview of the Post.")
      @NotNull

    public String getPreviewAttachment() {
    return previewAttachment;
  }

  public void setPreviewAttachment(String previewAttachment) {
    this.previewAttachment = previewAttachment;
  }

  public Post updatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

  /**
   * The Post update date.
   * @return updatedOn
  **/
  @ApiModelProperty(example = "2017-07-21T17:32:28Z", readOnly = true, value = "The Post update date.")
  
    @Valid
    public OffsetDateTime getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Post post = (Post) o;
    return Objects.equals(this.id, post.id) &&
        Objects.equals(this.tags, post.tags) &&
        Objects.equals(this.createdOn, post.createdOn) &&
        Objects.equals(this.user, post.user) &&
        Objects.equals(this.text, post.text) &&
        Objects.equals(this.title, post.title) &&
        Objects.equals(this.previewAttachment, post.previewAttachment) &&
        Objects.equals(this.updatedOn, post.updatedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tags, createdOn, user, text, title, previewAttachment, updatedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Post {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    previewAttachment: ").append(toIndentedString(previewAttachment)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
