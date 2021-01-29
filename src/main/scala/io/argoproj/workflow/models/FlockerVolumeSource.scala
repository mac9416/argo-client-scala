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

case class FlockerVolumeSource (
  /* Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated */
  datasetName: Option[String] = None,
  /* UUID of the dataset. This is unique identifier of a Flocker dataset */
  datasetUUID: Option[String] = None
) extends ApiModel

