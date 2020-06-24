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

case class SecretProjection (
  /* If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'. */
  items: Option[Seq[KeyToPath]] = None,
  /* Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  name: Option[String] = None,
  /* Specify whether the Secret or its key must be defined */
  optional: Option[Boolean] = None
) extends ApiModel


