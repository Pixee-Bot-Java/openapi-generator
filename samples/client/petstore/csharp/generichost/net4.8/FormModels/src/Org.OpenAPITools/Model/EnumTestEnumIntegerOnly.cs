// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;
using Org.OpenAPITools.Client;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Defines Enum_Test_enum_integer_only
    /// </summary>
    public enum EnumTestEnumIntegerOnly
    {
        /// <summary>
        /// Enum NUMBER_2 for value: 2
        /// </summary>
        NUMBER_2 = 2,

        /// <summary>
        /// Enum NUMBER_MINUS_2 for value: -2
        /// </summary>
        NUMBER_MINUS_2 = -2
    }

    /// <summary>
    /// Converts <see cref="EnumTestEnumIntegerOnly"/> to and from the JSON value
    /// </summary>
    public static class EnumTestEnumIntegerOnlyValueConverter
    {
        /// <summary>
        /// Parses a given value to <see cref="EnumTestEnumIntegerOnly"/>
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static EnumTestEnumIntegerOnly FromString(string value)
        {
            if (value.Equals((2).ToString()))
                return EnumTestEnumIntegerOnly.NUMBER_2;

            if (value.Equals((-2).ToString()))
                return EnumTestEnumIntegerOnly.NUMBER_MINUS_2;

            throw new NotImplementedException($"Could not convert value to type EnumTestEnumIntegerOnly: '{value}'");
        }

        /// <summary>
        /// Parses a given value to <see cref="EnumTestEnumIntegerOnly"/>
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static EnumTestEnumIntegerOnly? FromStringOrDefault(string value)
        {
            if (value.Equals((2).ToString()))
                return EnumTestEnumIntegerOnly.NUMBER_2;

            if (value.Equals((-2).ToString()))
                return EnumTestEnumIntegerOnly.NUMBER_MINUS_2;

            return null;
        }

        /// <summary>
        /// Converts the <see cref="EnumTestEnumIntegerOnly"/> to the json value
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        /// <exception cref="NotImplementedException"></exception>
        public static int ToJsonValue(EnumTestEnumIntegerOnly value)
        {
            return (int) value;
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="EnumTestEnumIntegerOnly"/>
    /// </summary>
    /// <exception cref="NotImplementedException"></exception>
    public class EnumTestEnumIntegerOnlyJsonConverter : JsonConverter<EnumTestEnumIntegerOnly>
    {
        /// <summary>
        /// Returns a  from the Json object
        /// </summary>
        /// <param name="reader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="options"></param>
        /// <returns></returns>
        public override EnumTestEnumIntegerOnly Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            string rawValue = reader.GetString();

            EnumTestEnumIntegerOnly? result = rawValue == null
                ? null
                : EnumTestEnumIntegerOnlyValueConverter.FromStringOrDefault(rawValue);

            if (result != null)
                return result.Value;

            throw new JsonException();
        }

        /// <summary>
        /// Writes the EnumTestEnumIntegerOnly to the json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="enumTestEnumIntegerOnly"></param>
        /// <param name="options"></param>
        public override void Write(Utf8JsonWriter writer, EnumTestEnumIntegerOnly enumTestEnumIntegerOnly, JsonSerializerOptions options)
        {
            writer.WriteStringValue(enumTestEnumIntegerOnly.ToString());
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="EnumTestEnumIntegerOnly"/>
    /// </summary>
    public class EnumTestEnumIntegerOnlyNullableJsonConverter : JsonConverter<EnumTestEnumIntegerOnly?>
    {
        /// <summary>
        /// Returns a EnumTestEnumIntegerOnly from the Json object
        /// </summary>
        /// <param name="reader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="options"></param>
        /// <returns></returns>
        public override EnumTestEnumIntegerOnly? Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            string rawValue = reader.GetString();

            EnumTestEnumIntegerOnly? result = rawValue == null
                ? null
                : EnumTestEnumIntegerOnlyValueConverter.FromStringOrDefault(rawValue);

            if (result != null)
                return result.Value;

            throw new JsonException();
        }

        /// <summary>
        /// Writes the DateTime to the json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="enumTestEnumIntegerOnly"></param>
        /// <param name="options"></param>
        public override void Write(Utf8JsonWriter writer, EnumTestEnumIntegerOnly? enumTestEnumIntegerOnly, JsonSerializerOptions options)
        {
            writer.WriteStringValue(enumTestEnumIntegerOnly?.ToString() ?? "null");
        }
    }
}
