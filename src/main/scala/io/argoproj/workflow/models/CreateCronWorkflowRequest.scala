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

case class CreateCronWorkflowRequest (
  createOptions: Option[CreateOptions] = None,
  cronWorkflow: Option[CronWorkflow] = None,
  namespace: Option[String] = None
) extends ApiModel


