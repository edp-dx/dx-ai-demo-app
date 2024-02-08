1. Application ai-demo-app has been successfully deployed!!
# ai-demo-app

![Version: 0.1.0](https://img.shields.io/badge/Version-0.1.0-informational?style=flat-square) ![Type: application](https://img.shields.io/badge/Type-application-informational?style=flat-square) ![AppVersion: 1.16.0](https://img.shields.io/badge/AppVersion-1.16.0-informational?style=flat-square)

A Helm chart for Kubernetes

**Homepage:** <https://github.com/edp-dx/dx-ai-demo-app>

## Maintainers

| Name | Email | Url |
| ---- | ------ | --- |
| DEV Team |  |  |

## Source Code

* <https://github.com/edp-dx/dx-ai-demo-app>
# Default values for ai-demo-app.
# This is a YAML-formatted file.
# Declare variables to be passed into your templates.

replicaCount: 1

image:
  repository: ai-demo-app
  pullPolicy: IfNotPresent
  # -- Overrides the image tag whose default is the chart appVersion.
  tag: ""

imagePullSecrets:
# Define secret to pull images. Secret can be provisioned by edp-install or manually.
  - name: regcred
nameOverride: ""
fullnameOverride: ""
framework: springboot

serviceAccount:
  # -- Specifies whether a service account should be created
  create: true
  # -- Annotations to add to the service account
  annotations: {}
  # -- The name of the service account to use. If not set and create is true, a name is generated using the fullname template
  name: ""

podAnnotations: {}

podSecurityContext: {}
  # fsGroup: 2000

securityContext: {}
  # capabilities:
  #   drop:
  #   - ALL
  # readOnlyRootFilesystem: true
  # runAsNonRoot: true
  # runAsUser: 1000

service:
  type: ClusterIP
  port: 80

ingress:
  enabled: false
  annotations: {}
    # kubernetes.io/ingress.class: nginx
    # kubernetes.io/tls-acme: "true"
  # -- pathType is only for k8s >= 1.1=
  pathType: Prefix
  # For Kubernetes >= 1.18 you should specify the ingress-controller via the field ingressClassName
  # See https://kubernetes.io/blog/2020/04/02/improvements-to-the-ingress-api-in-kubernetes-1.18/#specifying-the-class-of-an-ingress
  # ingressClassName: nginx
  # If need to use specific host, define host value below. By default host formed according to the pattern: <CODEBASE_NAME>-<CODEBASE_NAMESPACE>.<CLUSTER_DNS_WILDCARD>
  # host:
  path: "/"
  dnsWildcard: eks-sandbox.aws.main.edp.projects.epam.com
  tls: []
  #  - secretName: chart-example-tls
  #    hosts:
  #      - chart-example.local

livenessProbe:
  tcpSocket:
    port: http

readinessProbe:
  tcpSocket:
    port: http
  initialDelaySeconds: 20
apiVersion: v2
name: ai-demo-app
description: A Helm chart for Kubernetes

# A chart can be either an 'application' or a 'library' chart.
#
# Application charts are a collection of templates that can be packaged into versioned archives
# to be deployed.
#
# Library charts provide useful utilities or functions for the chart developer. They're included as
# a dependency of application charts to inject those utilities and functions into the rendering
# pipeline. Library charts do not define any templates and therefore cannot be deployed.
type: application

# This is the chart version. This version number should be incremented each time you make changes
# to the chart and its templates, including the app version.
# Versions are expected to follow Semantic Versioning (https://semver.org/)
version: 0.1.0

# This is the version number of the application being deployed. This version number should be
# incremented each time you make changes to the application. Versions are not expected to
# follow Semantic Versioning. They should reflect the version the application is using.
appVersion: 1.16.0

home: https://github.com/edp-dx/dx-ai-demo-app
sources:
  - https://github.com/edp-dx/dx-ai-demo-app
maintainers:
  - name: DEV Team
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>com.epam.edp</groupId>
	<artifactId>java-maven-springboot</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<packaging>jar</packaging>

	<description>Demo project for Spring Boot</description>

	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.0.1.RELEASE</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<java.version>11</java.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>


</project>
