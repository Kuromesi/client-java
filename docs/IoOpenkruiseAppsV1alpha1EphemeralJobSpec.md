
# IoKruiseAppsV1alpha1EphemeralJobSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeDeadlineSeconds** | **Long** | ActiveDeadlineSeconds specifies the duration in seconds relative to the startTime that the job may be active before the system tries to terminate it; value must be positive integer. Only works for Always type. |  [optional]
**parallelism** | **Integer** | Parallelism specifies the maximum desired number of pods which matches running ephemeral containers. |  [optional]
**paused** | **Boolean** | Paused will pause the ephemeral job. |  [optional]
**replicas** | **Integer** | Replicas indicates a part of the quantity from matched pods by selector. Usually it is used for gray scale working. if Replicas exceeded the matched number by selector or not be set, replicas will not work. |  [optional]
**selector** | [**IoKruiseAppsV1alpha1EphemeralJobSpecSelector**](IoKruiseAppsV1alpha1EphemeralJobSpecSelector.md) |  | 
**template** | [**IoKruiseAppsV1alpha1EphemeralJobSpecTemplate**](IoKruiseAppsV1alpha1EphemeralJobSpecTemplate.md) |  | 
**ttlSecondsAfterFinished** | **Integer** | ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the eJob finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, default value is 1800 If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes. |  [optional]



