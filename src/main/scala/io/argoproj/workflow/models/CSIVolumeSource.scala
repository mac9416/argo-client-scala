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

case class CSIVolumeSource (
  /* Driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster. */
  driver: String,
  /* Filesystem type to mount. Ex. \"ext4\", \"xfs\", \"ntfs\". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply. */
  fsType: Option[String] = None,
  nodePublishSecretRef: Option[LocalObjectReference] = None,
  /* Specifies a read-only configuration for the volume. Defaults to false (read/write). */
  readOnly: Option[Boolean] = None,
  /* VolumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver's documentation for supported values. */
  volumeAttributes: Option[Map[String, String]] = None
) extends ApiModel


