/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import android.os.Parcelable;
import android.os.Parcel;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ReadOnlyFirst
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0-SNAPSHOT")
public class ReadOnlyFirst implements Parcelable {
  public static final String SERIALIZED_NAME_BAR = "bar";
  @SerializedName(SERIALIZED_NAME_BAR)
  private String bar;

  public static final String SERIALIZED_NAME_BAZ = "baz";
  @SerializedName(SERIALIZED_NAME_BAZ)
  private String baz;

  public ReadOnlyFirst() {
  }

  public ReadOnlyFirst(
     String bar
  ) {
    this();
    this.bar = bar;
  }

   /**
   * Get bar
   * @return bar
  **/
  @javax.annotation.Nullable
  public String getBar() {
    return bar;
  }



  public ReadOnlyFirst baz(String baz) {
    this.baz = baz;
    return this;
  }

   /**
   * Get baz
   * @return baz
  **/
  @javax.annotation.Nullable
  public String getBaz() {
    return baz;
  }

  public void setBaz(String baz) {
    this.baz = baz;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadOnlyFirst readOnlyFirst = (ReadOnlyFirst) o;
    return Objects.equals(this.bar, readOnlyFirst.bar) &&
        Objects.equals(this.baz, readOnlyFirst.baz);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bar, baz);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadOnlyFirst {\n");
    sb.append("    bar: ").append(toIndentedString(bar)).append("\n");
    sb.append("    baz: ").append(toIndentedString(baz)).append("\n");
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


  public void writeToParcel(Parcel out, int flags) {
    out.writeValue(bar);
    out.writeValue(baz);
  }

  ReadOnlyFirst(Parcel in) {
    bar = (String)in.readValue(null);
    baz = (String)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<ReadOnlyFirst> CREATOR = new Parcelable.Creator<ReadOnlyFirst>() {
    public ReadOnlyFirst createFromParcel(Parcel in) {
      return new ReadOnlyFirst(in);
    }
    public ReadOnlyFirst[] newArray(int size) {
      return new ReadOnlyFirst[size];
    }
  };

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("bar");
    openapiFields.add("baz");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ReadOnlyFirst
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReadOnlyFirst.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReadOnlyFirst is not found in the empty JSON string", ReadOnlyFirst.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReadOnlyFirst.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReadOnlyFirst` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bar") != null && !jsonObj.get("bar").isJsonNull()) && !jsonObj.get("bar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bar").toString()));
      }
      if ((jsonObj.get("baz") != null && !jsonObj.get("baz").isJsonNull()) && !jsonObj.get("baz").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baz` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baz").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReadOnlyFirst.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReadOnlyFirst' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReadOnlyFirst> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReadOnlyFirst.class));

       return (TypeAdapter<T>) new TypeAdapter<ReadOnlyFirst>() {
           @Override
           public void write(JsonWriter out, ReadOnlyFirst value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReadOnlyFirst read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReadOnlyFirst given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReadOnlyFirst
  * @throws IOException if the JSON string is invalid with respect to ReadOnlyFirst
  */
  public static ReadOnlyFirst fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReadOnlyFirst.class);
  }

 /**
  * Convert an instance of ReadOnlyFirst to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

