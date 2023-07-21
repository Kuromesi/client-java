
# IoKruiseAppsV1alpha1NodeImageStatusTags

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionTime** | [**OffsetDateTime**](OffsetDateTime.md) | Represents time when the pulling task was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. |  [optional]
**imageID** | **String** | Represents the ID of this image. |  [optional]
**message** | **String** | Represents the summary information of this node |  [optional]
**phase** | **String** | Represents the image pulling task phase. | 
**progress** | **Integer** | Represents the pulling progress of this tag, which is between 0-100. There is no guarantee of monotonic consistency, and it may be a rollback due to retry during pulling. |  [optional]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | Represents time when the pulling task was acknowledged by the image puller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. |  [optional]
**tag** | **String** | Represents the image tag. | 
**version** | **Long** | Represents the internal version of this tag that the daemon handled. |  [optional]



