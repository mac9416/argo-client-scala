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

case class HDFSConfig (
  addresses: Option[Seq[String]] = None,
  hDFSKrbConfig: Option[HDFSKrbConfig] = None,
  /* HDFSUser is the user to access HDFS file system. It is ignored if either ccache or keytab is used. */
  hdfsUser: Option[String] = None
) extends ApiModel

