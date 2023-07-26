
# IoKruiseAppsV1alpha1NodeImageSpecPullPolicy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeDeadlineSeconds** | **Long** | ActiveDeadlineSeconds specifies the duration in seconds relative to the startTime that the task may be active before the system tries to terminate it; value must be positive integer. if not specified, the system will never terminate it. |  [optional]
**backoffLimit** | **Integer** | Specifies the number of retries before marking the pulling task failed. Defaults to 3 |  [optional]
**timeoutSeconds** | **Integer** | Specifies the timeout of the pulling task. Defaults to 600 |  [optional]
**ttlSecondsAfterFinished** | **Integer** | TTLSecondsAfterFinished limits the lifetime of a pulling task that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the task finishes, it is eligible to be automatically deleted. If this field is unset, the task won&#39;t be automatically deleted. If this field is set to zero, the task becomes eligible to be deleted immediately after it finishes. |  [optional]



