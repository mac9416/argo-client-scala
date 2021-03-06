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

case class TemplateRef (
  /* ClusterScope indicates the referred template is cluster scoped (i.e. a ClusterWorkflowTemplate). */
  clusterScope: Option[Boolean] = None,
  /* Name is the resource name of the template. */
  name: Option[String] = None,
  /* RuntimeResolution skips validation at creation time. By enabling this option, you can create the referred workflow template before the actual runtime. */
  runtimeResolution: Option[Boolean] = None,
  /* Template is the name of referred template in the resource. */
  template: Option[String] = None
) extends ApiModel


