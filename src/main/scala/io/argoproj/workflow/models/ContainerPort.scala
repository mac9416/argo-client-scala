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

case class ContainerPort (
  /* Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536. */
  containerPort: Int,
  /* What host IP to bind the external port to. */
  hostIP: Option[String] = None,
  /* Number of port to expose on the host. If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this. */
  hostPort: Option[Int] = None,
  /* If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services. */
  name: Option[String] = None,
  /* Protocol for port. Must be UDP, TCP, or SCTP. Defaults to \"TCP\". */
  protocol: Option[String] = None
) extends ApiModel


