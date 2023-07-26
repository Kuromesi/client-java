
# IoKruiseAppsV1alpha1NodeImageSpecTags

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Specifies the create time of this tag |  [optional]
**ownerReferences** | [**List&lt;IoKruiseAppsV1alpha1AdvancedCronJobStatusActive&gt;**](IoKruiseAppsV1alpha1AdvancedCronJobStatusActive.md) | List of objects depended by this object. If this image is managed by a controller, then an entry in this list will point to this controller. |  [optional]
**pullPolicy** | [**IoKruiseAppsV1alpha1NodeImageSpecPullPolicy**](IoKruiseAppsV1alpha1NodeImageSpecPullPolicy.md) |  |  [optional]
**tag** | **String** | Specifies the image tag | 
**version** | **Long** | An opaque value that represents the internal version of this tag that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server.   Populated by the system. Read-only. Value must be treated as opaque by clients and . |  [optional]



