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

case class RetryStrategy (
  backoff: Option[Backoff] = None,
  /* Limit is the maximum number of attempts when retrying a container */
  limit: Option[Int] = None,
  /* RetryPolicy is a policy of NodePhase statuses that will be retried */
  retryPolicy: Option[String] = None
) extends ApiModel


