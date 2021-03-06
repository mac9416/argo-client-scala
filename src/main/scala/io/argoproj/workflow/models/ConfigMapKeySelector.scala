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

case class ConfigMapKeySelector (
  /* The key to select. */
  key: String,
  /* Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  name: Option[String] = None,
  /* Specify whether the ConfigMap or its key must be defined */
  optional: Option[Boolean] = None
) extends ApiModel


