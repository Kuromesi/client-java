
# IoKruiseAppsV1alpha1ImageListPullJobStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Integer** | The number of running ImagePullJobs which are acknowledged by the imagepulljob controller. |  [optional]
**completed** | **Integer** | The number of ImagePullJobs which are finished |  [optional]
**completionTime** | [**OffsetDateTime**](OffsetDateTime.md) | Represents time when the all the image pull job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. |  [optional]
**desired** | **Integer** | The desired number of ImagePullJobs, this is typically equal to the number of len(spec.Images). | 
**failedImageStatuses** | [**List&lt;IoKruiseAppsV1alpha1ImageListPullJobStatusFailedImageStatuses&gt;**](IoKruiseAppsV1alpha1ImageListPullJobStatusFailedImageStatuses.md) | The status of ImagePullJob which has the failed nodes(status.Failed&gt;0) . |  [optional]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. |  [optional]
**succeeded** | **Integer** | The number of image pull job which are finished and status.Succeeded&#x3D;&#x3D;status.Desired. |  [optional]



