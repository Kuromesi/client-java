
# IoKruiseAppsV1alpha1ImagePullJobStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Integer** | The number of actively running pulling tasks. |  [optional]
**completionTime** | [**OffsetDateTime**](OffsetDateTime.md) | Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. |  [optional]
**desired** | **Integer** | The desired number of pulling tasks, this is typically equal to the number of nodes satisfied. | 
**failed** | **Integer** | The number of pulling tasks  which reached phase Failed. |  [optional]
**failedNodes** | **List&lt;String&gt;** | The nodes that failed to pull the image. |  [optional]
**message** | **String** | The text prompt for job running status. |  [optional]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. |  [optional]
**succeeded** | **Integer** | The number of pulling tasks which reached phase Succeeded. |  [optional]



