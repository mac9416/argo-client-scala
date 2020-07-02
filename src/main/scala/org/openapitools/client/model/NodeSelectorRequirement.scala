/**
 * Argo
 * Argo
 *
 * The version of the OpenAPI document: v2.7.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class NodeSelectorRequirement (
  /* The label key that the selector applies to. */
  key: Option[String] = None,
  /* Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt. */
  operator: Option[String] = None,
  values: Option[Seq[String]] = None
) extends ApiModel

