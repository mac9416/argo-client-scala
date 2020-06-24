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

case class SecurityContext (
  /* AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN */
  allowPrivilegeEscalation: Option[Boolean] = None,
  capabilities: Option[Capabilities] = None,
  /* Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. */
  privileged: Option[Boolean] = None,
  /* procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled. */
  procMount: Option[String] = None,
  /* Whether this container has a read-only root filesystem. Default is false. */
  readOnlyRootFilesystem: Option[Boolean] = None,
  /* The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. */
  runAsGroup: Option[Long] = None,
  /* Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. */
  runAsNonRoot: Option[Boolean] = None,
  /* The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. */
  runAsUser: Option[Long] = None,
  seLinuxOptions: Option[SELinuxOptions] = None,
  windowsOptions: Option[WindowsSecurityContextOptions] = None
) extends ApiModel

