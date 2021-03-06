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

case class GCSArtifact (
  /* Bucket is the name of the bucket */
  bucket: String,
  /* Key is the path in the bucket where the artifact resides */
  key: String,
  serviceAccountKeySecret: Option[SecretKeySelector] = None
) extends ApiModel


