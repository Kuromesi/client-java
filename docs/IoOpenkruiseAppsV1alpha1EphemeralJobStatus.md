
# IoKruiseAppsV1alpha1EphemeralJobStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionTime** | [**OffsetDateTime**](OffsetDateTime.md) | Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. |  [optional]
**conditions** | [**List&lt;IoKruiseAppsV1alpha1BroadcastJobStatusConditions&gt;**](IoKruiseAppsV1alpha1BroadcastJobStatusConditions.md) | INSERT ADDITIONAL STATUS FIELD - define observed state of cluster Important: Run \&quot;make\&quot; to regenerate code after modifying this file |  [optional]
**failed** | **Integer** | The number of pods which reached phase Failed. |  [optional]
**match** | **Integer** | The number of total matched pods. |  [optional]
**phase** | **String** | The phase of the job. |  [optional]
**running** | **Integer** | The number of actively running pods. |  [optional]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. |  [optional]
**succeeded** | **Integer** | The number of pods which reached phase Succeeded. |  [optional]
**waiting** | **Integer** | The number of waiting pods. |  [optional]



