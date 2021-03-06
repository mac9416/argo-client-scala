/**
 * Argo
 * Argo
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package io.argoproj.workflow.models

import io.argoproj.workflow.ApiModel

case class ObjectFieldSelector (
  /* Version of the schema the FieldPath is written in terms of, defaults to \"v1\". */
  apiVersion: Option[String] = None,
  /* Path of the field to select in the specified API version. */
  fieldPath: String
) extends ApiModel


