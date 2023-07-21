
# IoKruiseAppsV1alpha1NodeImageStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**desired** | **Integer** | The desired number of pulling tasks, this is typically equal to the number of images in spec. | 
**failed** | **Integer** | The number of pulling tasks  which reached phase Failed. |  [optional]
**firstSyncStatus** | [**IoKruiseAppsV1alpha1NodeImageStatusFirstSyncStatus**](IoKruiseAppsV1alpha1NodeImageStatusFirstSyncStatus.md) |  |  [optional]
**imageStatuses** | [**Map&lt;String, IoKruiseAppsV1alpha1NodeImageStatusImageStatuses&gt;**](IoKruiseAppsV1alpha1NodeImageStatusImageStatuses.md) | all statuses of active image pulling tasks |  [optional]
**pulling** | **Integer** | The number of pulling tasks which are not finished. |  [optional]
**succeeded** | **Integer** | The number of pulling tasks which reached phase Succeeded. |  [optional]



